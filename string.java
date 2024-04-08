class StringDemo{
	public static void main(String[] args){

		String str1 = new String("java");
		String str2 = new String("java");

		String str3 = "python";
		String str4 = "python";

		System.out.println(str1.equals(str2));

		System.out.println(str1==str2);
		System.out.println(str3==str4);
	}
}

