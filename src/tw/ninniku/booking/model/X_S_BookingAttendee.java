/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package tw.ninniku.booking.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for S_BookingAttendee
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_S_BookingAttendee extends PO implements I_S_BookingAttendee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230516L;

    /** Standard Constructor */
    public X_S_BookingAttendee (Properties ctx, int S_BookingAttendee_ID, String trxName)
    {
      super (ctx, S_BookingAttendee_ID, trxName);
      /** if (S_BookingAttendee_ID == 0)
        {
			setS_BookingAttendee_ID (0);
        } */
    }

    /** Load Constructor */
    public X_S_BookingAttendee (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_S_BookingAttendee[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set BookingAttendee.
		@param S_BookingAttendee_ID BookingAttendee	  */
	public void setS_BookingAttendee_ID (int S_BookingAttendee_ID)
	{
		if (S_BookingAttendee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_S_BookingAttendee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_S_BookingAttendee_ID, Integer.valueOf(S_BookingAttendee_ID));
	}

	/** Get BookingAttendee.
		@return BookingAttendee	  */
	public int getS_BookingAttendee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_S_BookingAttendee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set S_BookingAttendee_UU.
		@param S_BookingAttendee_UU S_BookingAttendee_UU	  */
	public void setS_BookingAttendee_UU (String S_BookingAttendee_UU)
	{
		set_Value (COLUMNNAME_S_BookingAttendee_UU, S_BookingAttendee_UU);
	}

	/** Get S_BookingAttendee_UU.
		@return S_BookingAttendee_UU	  */
	public String getS_BookingAttendee_UU () 
	{
		return (String)get_Value(COLUMNNAME_S_BookingAttendee_UU);
	}

	public I_S_Booking getS_Booking() throws RuntimeException
    {
		return (I_S_Booking)MTable.get(getCtx(), I_S_Booking.Table_Name)
			.getPO(getS_Booking_ID(), get_TrxName());	}

	/** Set Booking.
		@param S_Booking_ID Booking	  */
	public void setS_Booking_ID (int S_Booking_ID)
	{
		if (S_Booking_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_S_Booking_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_S_Booking_ID, Integer.valueOf(S_Booking_ID));
	}

	/** Get Booking.
		@return Booking	  */
	public int getS_Booking_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_S_Booking_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}