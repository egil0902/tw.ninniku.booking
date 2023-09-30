package tw.ninniku.booking.process;

import java.util.List;

import org.compiere.model.Query;
import org.compiere.process.SvrProcess;
import tw.ninniku.booking.model.MBooking;
import tw.ninniku.booking.model.MResourceAssignment;

public class SyncBooking extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		StringBuilder whereSql = new StringBuilder(); ;
		
		int counter = 0;
		List<MBooking> bookings = new Query(getCtx(), MBooking.Table_Name, whereSql.toString(), get_TrxName())
				 .setParameters()
				.setOrderBy("S_Resource_ID").setOnlyActiveRecords(true).list();
		
		for (MBooking mBooking : bookings) {
			int  rsid = mBooking.getS_ResourceAssignment_ID();
			if(rsid > 0)
			{
				MResourceAssignment assignment = new MResourceAssignment(getCtx(), rsid, get_TrxName());
				assignment.setAssignDateFrom(mBooking.getAssignDateFrom());
				assignment.setAssignDateTo(mBooking.getAssignDateTo());
				assignment.save(get_TrxName());
				
			}else {
				MResourceAssignment assignment = new MResourceAssignment(getCtx(), 0, get_TrxName());
				assignment.setAD_Org_ID(mBooking.getAD_Org_ID());
				assignment.setS_Resource_ID(mBooking.getS_Resource_ID());
				assignment.setName(mBooking.getName());
				assignment.setDescription(mBooking.getDescription());
				assignment.set_ValueNoCheck("CreatedBy", mBooking.getCreatedBy());
				assignment.set_ValueNoCheck("UpdatedBy", mBooking.getUpdatedBy());
				assignment.setAssignDateFrom(mBooking.getAssignDateFrom());
				assignment.setAssignDateTo(mBooking.getAssignDateTo());
				assignment.save(get_TrxName());
				
			}
			counter++;
		}
		
		return " updated counter: " +  counter;
	}

}
