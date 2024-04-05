//simple if else demo.

import java.io.*;
class IfelseDemo{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter key-1 on keyboard");
		int a = Integer.parseInt(br.readLine());

		if(a==1){
			System.out.println("You have pressed key-1 on keyboard");
		}else{
			System.out.println("You have not pressed key-1 on keyboard");
		}
	}
}

//Here if we press key 1 - condition in if block will be true and it will execute only the if block
//and directly terminate the program.
//If we had pressed any other key than 1 - then condition in if block would have become false - so it will not execute if block and go to else block and will execute only else block.

