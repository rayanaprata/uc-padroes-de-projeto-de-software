import java.util.Base64;

public class FiveBitDecompression implements DecompressionAlgorithm {

	public String decompress(String entrada) {

		String strTemp = new String("");
		String strBinary = new String("");
		String strText = new String("");
		byte[] encoded = Base64.getDecoder().decode(entrada);
		int bit = 5;
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
