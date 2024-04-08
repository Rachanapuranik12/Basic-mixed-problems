class StringDemo1{
	public static void main(String[] args){

		String s1 = "Tech";
		String s2 = new String("Tech").intern();


		System.out.println(s1==s2);
	}
}
