import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Hello World");
		int n = 5;
		int[] arr = genereta_massive(n);
		print_massive(arr);

		int[] arr_sorted = bubble_sort(arr);
		print_massive(arr_sorted);
	}

	public static void print_massive(int[] arr) {
		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

	public static int[] genereta_massive(int n) {
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = rd.nextInt() % (int) 1e2;
		}
		return arr;
	}

	public static int[] bubble_sort(int[] arr) {
		// copy creating
		int[] arr_copy = new int[arr.length];
		for (int i = 0; i < arr.length; ++i) {
			arr_copy[i] = arr[i];
		}

		// sorting
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length; ++j) {
				if (arr_copy[j] > arr_copy[i]) {
					swap(arr_copy, i, j);
				}
			}
		}
		return arr_copy;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}