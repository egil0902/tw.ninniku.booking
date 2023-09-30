package tw.ninniku.booking.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

import tw.ninniku.booking.model.MBooking;
import tw.ninniku.booking.model.MBookingAttendee;
import tw.ninniku.booking.model.MResourceAssignment;

public class BookingModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {
		if(tableName.equals(MBooking.Table_Name))
			return MBooking.class;
		if(tableName.equals(MBookingAttendee.Table_Name))
			return MBookingAttendee.class;
		if(tableName.equals(MResourceAssignment.Table_Name))
			return MResourceAssignment.class;
		
		//MBookingAttendee
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		if(tableName.equals(MBooking.Table_Name))
			return new MBooking(Env.getCtx(),Record_ID,trxName);
		if(tableName.equals(MBookingAttendee.Table_Name))
			return new MBookingAttendee(Env.getCtx(),Record_ID,trxName);		
		if(tableName.equals(MResourceAssignment.Table_Name))
			return new MResourceAssignment(Env.getCtx(),Record_ID,trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		if(tableName.equals(MBooking.Table_Name))
			return new MBooking(Env.getCtx(),rs,trxName);
		if(tableName.equals(MBookingAttendee.Table_Name))
			return new MBookingAttendee(Env.getCtx(),rs,trxName);
		if(tableName.equals(MResourceAssignment.Table_Name))
			return new MResourceAssignment	(Env.getCtx(),rs,trxName);
		return null;
	}

}
