//Explicit typecasting - converting a higher datatype into lower datatype.
//Also called as narrowing type casting.
//Its done manually by programmer, and if we do not perform casting explicitly then compiler gives a compile time error.


class Explicit{
	public static void main(String[] args){

		double pi = 3.14159;
		int duppi = (int)pi;

		System.out.println(pi);
		System.out.println(duppi);

		//System.out.println(duppi); // error - possible lossy conversion from double to int.

	}
}
