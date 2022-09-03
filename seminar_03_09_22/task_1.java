/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n = 5;
		int[] arr = genereta_massive(n);
		for (int elem : arr) {
            System.out.print(elem + " ");
		}
        System.out.println();
		int[] mmm = max_mean_min_values(arr);
		for (int elem : mmm) {
            System.out.print(elem + " ");
		}
		
	}
	
	public static int[] genereta_massive(int n) {
	    Random rd = new Random();
	    int[] arr = new int[n];
		for (int i=0; i < arr.length; ++i) {
		    arr[i] = rd.nextInt() % (int)1e2;
		}
		return arr;
	}
	
	public static int[] max_mean_min_values(int[] arr) {
	    int[] max_mean_min = new int[3];
	    max_mean_min[1] = 0;
	    max_mean_min[0] = (int)-1e9;
	    max_mean_min[2] = (int)1e9;
	    
	    for (int i = 0; i < arr.length; ++i) {
	        // max
	        if (max_mean_min[0] < arr[i]) {
	            max_mean_min[0] = arr[i];
	        }
	        if (max_mean_min[2] > arr[i]) {
	            max_mean_min[2] = arr[i];
	        }
	        max_mean_min[1] += arr[i];
	    }
	    max_mean_min[1] /= arr.length;
	    return max_mean_min;
	}
}
