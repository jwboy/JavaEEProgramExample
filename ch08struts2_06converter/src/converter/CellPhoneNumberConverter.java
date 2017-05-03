package converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import beans.CellPhoneNumber;

public class CellPhoneNumberConverter extends StrutsTypeConverter {
	@Override
	public Object convertFromString(Map arg0, String[] values, Class arg2) {
		CellPhoneNumber cellNumber = new CellPhoneNumber();
		System.out.println("############"+"values[0]="+values[0]);
		String[] cellnumber = values[0].split("-");
		
		String countryCode = cellnumber[0];  
		String number = cellnumber[1];
		
		System.out.println("countryCode="+countryCode+"  number="+number);
		
		cellNumber.setCountryCode(Integer.parseInt(countryCode.trim()));
		cellNumber.setNumber(Long.parseLong(number.trim()));
        System.out.println("reslut="+cellNumber.toString());
		return cellNumber;
	}

	@Override
	public String convertToString(Map arg0, Object obj) {
		CellPhoneNumber cellNumber = (CellPhoneNumber)obj;
		
	    String numberStr = cellNumber.getCountryCode()+ "_" + cellNumber.getNumber();
		return numberStr;
	}

}
