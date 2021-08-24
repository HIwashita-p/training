public class BasicProgramingExercise {
	public static void main(String[] args) {
		int[] array = new int[] {6, 2, 5, 10, 11, 1, 17, 20};
		
		int max, min;
		
		max = array[0];
		min = array[0];
		
		for(int i=1; i < array.length; i++){
			if(max < array[i]){
				max = array[i];
			}
			if(min > array[i]){
				min = array[i];
			}
			
		}
		
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		
	}
}