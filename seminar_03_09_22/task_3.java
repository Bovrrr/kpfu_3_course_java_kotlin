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
		print_massive(arr);

        primary_numbers(arr);

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
		for (int i=0; i < arr.length; ++i) {
		    arr[i] = rd.nextInt() % (int)1e2;
		}
		return arr;
	}

    public static void primary_numbers(int[] arr) {
        for (int elem : arr) {
            if (is_primary(elem)) {
                System.out.print(elem + " ");
            }
        }
    }

    public static boolean is_primary(int a) {
        int a_2 = (int)(a/2);
        if (a_2 < 0) {
            a_2 += -2 * a_2;
        }
        //System.out.println(a + " " + a_2);
        for (int i=2; i <= a_2; ++i) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
	
}

