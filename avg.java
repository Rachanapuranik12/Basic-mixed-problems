//Calculate average of 3 numbers.

import java.io.*;

class AverageCalculate{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 3 numbers: ");

		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		
		double avg = (n1+n2+n3)/3.0;

		System.out.println("Average of numbers "+n1+","+n2+","+n3+" is "+avg);
	}
}
