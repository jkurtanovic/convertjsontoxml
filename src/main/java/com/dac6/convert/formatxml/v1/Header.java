package com.dac6.convert.formatxml.v1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.dac6.convert.dac6.v1.CountryCodeType;
import com.dac6.convert.dac6.v1.HeaderType;

public class Header {
	
public HeaderType createHeaderXml ()  {
			
		HeaderType headerType = new HeaderType();
		CountryCodeType countrCodeType = null;

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		XMLGregorianCalendar xmlDate = null;
		try {
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		//----HEADER---------------------------------------------------------------
		// HeaderType
		headerType.setTransmittingCountry(countrCodeType.HR);
		headerType.setMessageRefId("59efadcb-806e-463d-9834-2122d89138dd");
		headerType.setTimestamp(xmlDate);
		// HeaderType
		//----------------------------------------------------------------------------
		
		return headerType;
	}

}
