//Take height and age from user and print it.

import java.io.*;
class UserInput{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter height:");
		float height = Float.parseFloat(br.readLine());

		System.out.println("Enter age: ");
		byte age = Byte.parseByte(br.readLine());

		System.out.println("Height: "+height);
		System.out.println("Age: "+age);

	}
}
