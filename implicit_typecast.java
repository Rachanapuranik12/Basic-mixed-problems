//implicit typecast -  storing value of lower datatype in a higher datatype.

class ImplicitTypecast{

	public static void main(String[] args){

	int sal = 365000;
	double dsal = sal;

	System.out.println("Int salary: "+sal);
	System.out.println("Double salary: "+dsal);
}
}

// Also called as widening conversion - its done automatically by compiler internally as there is no loss of data
// in this type of conversion.
