package primaryschool_java_concepts;

public class String_Array {

	public static void main(String[] args) {
		//string is used to store single or group of alphabets/numbers/special charecters
	    // values should be placed into double quotes("").
		
		String a = "Hi All";
		String b = "Selinium is test automation framework";
		
		System.out.println(a + b);
		System.out.println(a + " " + b);
		
		// length() method is used to know the number of characters.
		System.out.println(b.length());
		
		// trim() method
		String c = " Hello everyone ";
		System.out.println(c);
		System.out.println(c.trim());
		
		// case methods -> upper and lowercases
		String d = "tEst AUtomAtion";
		System.out.println(d.toUpperCase());
		System.out.println(d.toLowerCase());
		

	}

}
