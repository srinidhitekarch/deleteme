package deleteMe;

public class tcexception {

	public static void main(String[] args) throws Exception {
		/*try {
		int[] iArr= {2,5,0};
		System.out.println(divide(iArr[0], iArr[3]));
		}catch(Exception a) {
			System.out.println("Write index is not passed  "+a);
		}*/
		
		 try { 
	            //String a = null; //null value
			 //System.out.println(a.charAt(0)); 
			 String a = "This is like chipping ";
			 System.out.println(a.charAt(29));  
			 System.out.println("2123");
	        } catch(NullPointerException e) { 
	            System.out.println("NullPointerException.."); 
	        } 
		 catch(StringIndexOutOfBoundsException e) { 
			 throw new Exception("");
	            //System.out.println("StringIndexOutOfBoundsException"); 
	        } catch(Exception a) {
	        	
	        }finally {
				System.out.println("im there");
			}
		 
	}

	private static int divide(int a, int b) {
		try {
		return b/a;
		}catch(Exception ea) {
			System.out.println("Found Exception. Use Valid one . Returning Zero");
			return 0;
		}
	}

}
