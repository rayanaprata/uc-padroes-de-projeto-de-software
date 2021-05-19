
public class Main {

	public static void main(String[] args) {
		
		String str1 = "hhhheeeeellloopppp",str2;
		System.out.println("Length = " + str1.length());
		SimpleMethod method1 = new SimpleMethod();		
		str2 = method1.compress(str1);
		System.out.println("Compressed string: " + str2);
		System.out.println("Decompressed string: " + method1.decompress(str2));
		
		if(method1.decompress(str2).equalsIgnoreCase(str1)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}
		
		str1 = "hhhhhhheeeeeeeeelllooooopppppppppppppppppppppppppppppppppppppppp";
		System.out.println("Length = " + str1.length());
		FiveBit method2 = new FiveBit();
		str2 = method2.encode(str1);
		System.out.println("Compressed string: " + str2);
		System.out.println("Decompressed string: " + method2.decode(str2));
		
		if(method2.decode(str2).equalsIgnoreCase(str1)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

	}	
	
}
