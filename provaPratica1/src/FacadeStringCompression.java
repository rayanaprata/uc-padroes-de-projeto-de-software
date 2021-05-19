
public class FacadeStringCompression {
	
	

	public void print(String str1) {		
		System.out.println("Original string: " + str1);
		System.out.println("Length = " + str1.length());
		
	}
	
	public String compress(String str1) {
		CompressionFactoryAlgorithm cfa = new CompressionFactoryAlgorithm();
		CompressionAlgorithm compactor = cfa.getMethod(str1);
		String str2 = compactor.compress(str1);
		System.out.println("Compressed string: " + str2);
		return str2;
	}
	
	public String decompress(String str1) {
		DecompressionFactoryAlgorithm cfa = new DecompressionFactoryAlgorithm();
		DecompressionAlgorithm decompactor = cfa.getMethod(str1);
		String str2 = decompactor.decompress(str1);
		System.out.println("Decompressed string: " + str2);
		return str2;
	}
	
	public void isEqual(String str, String decompress) {
		DecompressionFactoryAlgorithm cfa = new DecompressionFactoryAlgorithm();
		DecompressionAlgorithm decompactor = cfa.getMethod(str);
		if(str.length() > 20) {
			System.out.println("Compression Algorithm: FiveBit");
			System.out.println("Decompression Algorithm: FiveBit");
		}else {
			System.out.println("Compression Algorithm: SimpleMethod");
			System.out.println("Decompression Algorithm: SimpleMethod");
		}
		//Verificar impressao
		System.out.println(str);
		System.out.println(decompress);
		
		if(str.equalsIgnoreCase(decompress)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}
		System.out.println();
		
	}	
	
}
