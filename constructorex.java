class Teacher{
	String name;
	String sub;
	int sal;
	void teach(){
		System.out.println("A teacher teaches");
	}

	Teacher(String name, String sub, int sal){

		this.name = name;
		this.sub = sub;
		this.sal = sal;
	}
}

class TeacherApp{
	public static void main(String[] args){

		Teacher t1 = new Teacher("Deep","Java",25000);
		Teacher t2 = new Teacher("Kushal","Aptitude",30000);

		System.out.println("Object1: ");
		System.out.println("Name: "+t1.name);
		System.out.println("Sub: "+t1.sub);
		System.out.println("Sal: "+t1.sal);


		System.out.println("Object2: ");
		System.out.println("Name: "+t2.name);
		System.out.println("Sub: "+t2.sub);
		System.out.println("Sal: "+t2.sal);
	}
}




