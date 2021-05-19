
public class DecompressionFactoryAlgorithm {

	public DecompressionAlgorithm getMethod(String str) {
		if(str.length() > 20) {
			return new FiveBitDecompression();
		}
		return new SimpleMethodDecompression();
	}
	
}
