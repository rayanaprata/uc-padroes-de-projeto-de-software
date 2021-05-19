
public class CompressionFactoryAlgorithm {
	
	public CompressionAlgorithm getMethod(String str) {
		if(str.length() > 20) {
			return new FiveBitCompression();
		}
		return new SimpleMethodCompression();
	}

}
