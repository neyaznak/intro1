package searching_sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int [] input = {1,2,4,7,0,8,45,9};
		bubbleSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}

	}

	public static void bubbleSort(int[] input) {
		for(int i = 0; i < input.length - 1; i++) {
			for(int j = 0; j < input.length - 1; j++) {
				if(input[j] > input[j + 1]) {        // use input[j] < input[j + 1] for Decreasing order
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		
	}

}
