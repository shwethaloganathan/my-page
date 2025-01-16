package primaryschool_java_concepts;

public class Variables_class {
	//Global variable
	//local variable
	// int, short, long, byte
	
	
	public static void add() {
		System.out.println("ADD METHOD");
		int a = 20;
		int b = 30;
		System.out.println(a + b);
	}
	
	public static void sub() {
		System.out.println("SUB METHOD");
		int a = 80;
		int b = 70;
		System.out.println(a - b);
	}
	
	public static void lesser_greater() {
		System.out.println("LnG METHOD");
		int a = 50;
		int b = 90;
		System.out.println(a > b);
		System.out.println(a < b);
		
	}
	
	public static void dif_size_num() {
         byte num;
    	
    	num = 127;
    	System.out.println(num);

		
			}
	
	
     public static void main(String[] args) {
	 add();
	 sub();
	 lesser_greater();
	 dif_size_num();
	 

	}

}
