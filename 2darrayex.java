//2D array for taking names of students in different classes.

import java.io.*;
class ArrayEx{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of classes: ");
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter number of students in each class:");
		int col = Integer.parseInt(br.readLine());

		String name[][] = new String[row][col];

		System.out.println("Enter names: ");

		for(int i=0;i<name.length;i++){

			for(int j=0;j<name[i].length;j++){

				name[i][j] = br.readLine();
			}

			
			}

		System.out.println("Names are: ");

		for(int i=0;i<name.length;i++){
			for(int j=0;j<name[i].length;j++){
				System.out.print(name[i][j]+"   ");
			
		}
		System.out.println();
	}
	}
}

