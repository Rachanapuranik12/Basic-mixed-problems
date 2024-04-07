//switch demo

import java.io.*;
class SwitchDemo{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
		System.out.println("Enter any char from a-e");
		char ch = br.readLine().charAt(0);

		switch(ch){
			case 'a':
				System.out.println("You have entered 'a' character");
				break;

			case 'b':
				System.out.println("You have entered 'b' character");
				break;

			case 'c':
				System.out.println("You have entered 'c' character");
				break;

			case 'd':
				System.out.println("You have entered 'd' character");
				break;

			case 'e':
				System.out.println("You have entered 'a' character");
				break;
			default:
				System.out.println("Entered char not in between a-e");
				
		}
	}

}

