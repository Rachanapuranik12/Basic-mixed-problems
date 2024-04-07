//else if ladder example

import java.io.*;
class ElseIfDemo{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any number from 1-4: ");
		int a = Integer.parseInt(br.readLine());

		if(a==1){
			System.out.println("You have entered 1");
		}else if(a==2){
			System.out.println("You have entered 2");
		}else if(a==3){
			System.out.println("You have entered 3");
		}else if(a==4){
			System.out.println("You have entered 4");
		}else{
			System.out.println("Number entered is not in between 1-4");
		}
	}
}
