
public class HeapAndScp {

	public static void main(String[] args) {

		String a1 = "Hello Erdem";

		String a2 = "Hello";

		//a2 = a2.concat(" Erdem");   // a2 = a2 + " Erdem";
		//a2 = "Hello".concat(" Erdem"); //
		//System.out.println(a1 == a2); //false, because of method call, a2 is executed at RT and 
										//a2 is created in Heap
		
		String a3 = a2 + " Erdem";  // since a2 (a variable) is used, it is created at RT and a3 is now 
									// sent to heap. 

		System.out.println(a1 == a3); // false

		System.out.println(2 + 3);
		int a = 4;
		System.out.println(2 + a);
		
		String s1 = new String("u cannot change me!");
        String s2 = new String("u cannot change me!");
        System.out.println(s1 == s2);//false
        
        String s3 = "u cannot change me!";
        System.out.println(s1 == s3);//false
        
        String s4 = "u cannot change me!";
        System.out.println(s3 == s4);//true
        
        String s5 = "u cannot "+"change me!";//these two literals will be combined at compilation time and make only 1 literal. 
        System.out.println(s3 ==s5);//true	 //so here there are not 2 literals in scp, only 1 which is "u cannot change me!"
        
        String s6 = "u cannot ";
        String s7 = s6 + "change me!"; //happens in RT and goes the heap
        System.out.println(s3 == s7);//false
        
        final String s8 = "u cannot ";
        String s9 = s8 + "change me!";//this doesn't happen in RT because s8 is final, so considered as a constant
        
        System.out.println(s3 ==s9);//true
        System.out.println(s6 == s8);//true
		
	}
}
