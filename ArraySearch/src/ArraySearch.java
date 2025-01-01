
public class ArraySearch {

	public static void main(String[] args) {
		 boolean notfound = false;
		int [] grades = {2, 4, 6, 8, 10};
		
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] == 6) {
				notfound = false;
				
				System.out.println("Found! at index " + i);
				
			return;}
				
				else { notfound = true;
			
				}
		} System.out.println("Number Not Found!!!");

	} 

}
