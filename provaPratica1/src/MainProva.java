
public class MainProva {

	public static void main(String[] args) {
		
		FacadeStringCompression facade = new FacadeStringCompression();
		
		String str1 = "hhhheeeeellloopppp",str2;
		facade.print(str1);
		str2 = facade.compress(str1);
		facade.isEqual(str1, facade.decompress(str2));
			
		str1 = "hhhhhhheeeeeeeeelllooooopppppppppppppppppppppppppppppppppppppppp";
		facade.print(str1);
		str2 = facade.compress(str1);
		facade.isEqual(str1, facade.decompress(str2));
		
	}	
	
}
