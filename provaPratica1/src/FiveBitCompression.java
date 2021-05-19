import java.util.Base64;

public class FiveBitCompression implements CompressionAlgorithm{
	
	public String compress(String txt){
		
		String temp;
		String strBinary = new String("");
		int bit = 5;
		int length = txt.length();
		float tmpRet1=0,tmpRet2=0;
		tmpRet1=5.0f;
		tmpRet2=8.0f;
		
		byte encoded[]=new byte[(int)(tmpRet1*Math.ceil(length/tmpRet2))];
		
		char str[]=new char[length];
		txt.getChars(0,length,str,0);
		int chaVal = 0;
		
		for (int i = 0;i<length; i++){
			int tovalue = 0;
			switch(str[i]){
			case'e':tovalue=5;break;
			case'h':tovalue=8;break; 
			case'l':tovalue=12;break; 
			case'o':tovalue=15;break;
			case'p':tovalue=16;break;
			}
			temp = Integer.toBinaryString(tovalue);
			while(temp.length()%bit != 0){
				temp="0"+temp;
			}
			strBinary=strBinary+temp;
		}
		while(strBinary.length()%8 != 0){
			strBinary=strBinary+"0";
		}
		Integer tempInt =new Integer(0);
		for(int i=0 ; i<strBinary.length();i=i+8){
			tempInt = tempInt.valueOf(strBinary.substring(i,i+8),2);
			encoded[i/8]=tempInt.byteValue();
		}

		String result = Base64.getEncoder().encodeToString(encoded);
		return result;
	}

}
