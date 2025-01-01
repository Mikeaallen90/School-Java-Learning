import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		 Scanner input  = new Scanner(System.in);
		int size = input.nextInt();
		int [] grades = new int [size];
		
		for(int i = 0; i < size; i++) {
			int x = input.nextInt();
			grades[i] = x;}
		
		System.out.println(Arrays.toString(grades));
		
		
		//Extra for kicks to see if I could get array to auto iterate
		for(int j = 0; j < size; j++) {
			System.out.println(grades[j]);
		}
		
		input.close(); 
		
		}
	}


