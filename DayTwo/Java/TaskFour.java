import java.util.Arrays;
	public class TaskFour{
		public static void main(String[] args){
			int[] array = {1, 2, 3, 4, 5, 6, 7};
			int[] result = answer(array);
			System.out.print(Arrays.toString(result));
		}

		public static int[] answer(int[] number){
			int[] even = new int[number.length];
			for(int counter = 0; counter < number.length; counter++){
				if(counter % 2 == 0){
					even[counter] = number[counter];
				}
			}	
			return even;
		}

	}