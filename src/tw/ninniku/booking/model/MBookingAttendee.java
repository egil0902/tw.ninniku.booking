package tw.ninniku.booking.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MBookingAttendee extends X_S_BookingAttendee {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5165705908715069560L;

	public MBookingAttendee(Properties ctx, int S_BookingAttendee_ID, String trxName) {
		super(ctx, S_BookingAttendee_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MBookingAttendee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
