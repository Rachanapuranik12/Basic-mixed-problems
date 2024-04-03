//Simple if demo

import java.io.*;
class Demo{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Press key-1 on keyboard");

		int n = Integer.parseInt(br.readLine());

		if(n==1){
			System.out.println("You have pressed key-1 on keyboard");
		}

			System.out.println("You have not pressed key-1 on keyboard");
	}
}

//If we press 1 on keyboard - condition in if becomes true so it executes statement inside if - now
//control comes out of if condition and also executes the next print line as its not in any if block
//so by linearly the program executes all lines, so
//if we press 1 output is - 
//you have pressed 1 on keyboard
//you have not pressed 1 on keyboard.
//it prints both lines which is logically incorrect
//hence in such cases we use if else in which only 1 of block is executed.
