package My_Package;

public class PriceValidation {
	public boolean validateResult(String price1, String price2, String total) {
		String val1 = "";
		String val2 = "";
		String grandTotal = "";
		for(int i=0;i<price1.length();i++) {
			if(Character.getNumericValue(price1.charAt(i))<=9 && Character.getNumericValue(price1.charAt(i))>=0) {
				val1 = val1 + price1.charAt(i);
			}
		}
		for(int i=0;i<price2.length();i++) {
			if(Character.getNumericValue(price2.charAt(i))<=9 && Character.getNumericValue(price2.charAt(i))>=0) {
				val2 = val2 + price2.charAt(i);
			}
		}
		for(int i=0;i<total.length();i++) {
			if(Character.getNumericValue(total.charAt(i))<=9 && Character.getNumericValue(total.charAt(i))>=0) {
				grandTotal = grandTotal + total.charAt(i);
			}
		}
		if(Integer.parseInt(val1)+Integer.parseInt(val2)==Integer.parseInt(grandTotal)) {
			return true;
		}
		else {
			return false;
		}
	}
}
