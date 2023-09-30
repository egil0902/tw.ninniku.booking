package tw.ninniku.booking.factories;
import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import tw.ninniku.booking.process.SyncBooking;

public class BookingProcessFactory implements IProcessFactory {
	
	@Override
	public ProcessCall newProcessInstance(String className) {
		if(className.equals(SyncBooking.class.getName()))
			return new SyncBooking();
		
		//UpdateInventoryLineByExcel ExpiredMaterialStroageCreateMovement ProductionFeeded
		return null;
	}

}
