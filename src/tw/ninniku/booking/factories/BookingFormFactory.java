package tw.ninniku.booking.factories;

import org.adempiere.webui.factory.IFormFactory;
import org.adempiere.webui.panel.ADForm;

import tw.ninniku.booking.form.BookingTimeline;

public class BookingFormFactory implements IFormFactory {

	@Override
	public ADForm newFormInstance(String formName) {
		if(formName.contains("BookingTimeline"))
		{
			return new BookingTimeline().getForm();
		}
		return null;
	}

}
