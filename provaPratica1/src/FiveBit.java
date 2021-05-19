
import java.util.Base64;

public class FiveBit {

	String encode(String txt) {
		
		String temp;
		String strBinary = new String("");
		int bit = 5;
		int length = txt.length();
		float tmpRet1 = 0, tmpRet2 = 0;
		tmpRet1 = 5.0f;
		tmpRet2 = 8.0f;
		
		byte encoded[] = new byte[(int) (tmpRet1 * Math.ceil(length / tmpRet2))];
		
		char str[] = new char[length];
		txt.getChars(0, length, str, 0);
		int chaVal = 0;
		
		
		for (int i = 0; i < length; i++) {
			int tovalue = 0;
			switch (str[i]) {
			case 'e':
				tovalue = 5;
				break;
			case 'h':
				tovalue = 8;
				break;
			case 'l':
				tovalue = 12;
				break;
			case 'o':
				tovalue = 15;
				break;
			case 'p':
				tovalue = 16;
				break;
			}
			temp = Integer.toBinaryString(tovalue);
			while (temp.length() % bit != 0) {
				temp = "0" + temp;
			}
			strBinary = strBinary + temp;
		}
		
		while (strBinary.length() % 8 != 0) {
			strBinary = strBinary + "0";
		}
		
		Integer tempInt = new Integer(0);
		for (int i = 0; i < strBinary.length(); i = i + 8) {
			tempInt = tempInt.valueOf(strBinary.substring(i, i + 8), 2);
			encoded[i / 8] = tempInt.byteValue();
		}

		String result = Base64.getEncoder().encodeToString(encoded);
		return result;
	}

	String decode(String entrada) {
		byte[] encoded = Base64.getDecoder().decode(entrada);
		int bit = 5;
		String strTemp = new String("");
		String strBinary = new String("");
		String strText = new String("");
		Integer tempInt = new Integer(0);
		int intTemp = 0;
		for (int i = 0; i < encoded.length; i++) {
			if (encoded[i] < 0) {
				intTemp = (int) encoded[i] + 256;
			} else
				intTemp = (int) encoded[i];
			strTemp = Integer.toBinaryString(intTemp);
			while (strTemp.length() % 8 != 0) {
				strTemp = "0" + strTemp;
			}
			strBinary = strBinary + strTemp;
		}
		
		for (int i = 0; i < strBinary.length(); i = i + bit) {
			tempInt = tempInt.valueOf(strBinary.substring(i, i + bit), 2);
			char tochar = ' ';
			switch (tempInt.intValue()) {
			case 5:
				tochar = 'e';
				break;
			case 8:
				tochar = 'h';
				break;
			case 12:
				tochar = 'l';
				break;
			case 15:
				tochar = 'o';
				break;
			case 16:
				tochar = 'p';
				break;
			}
			strText = strText + tochar;
		}
		return strText;
	}

}
