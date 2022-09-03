
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        int n = 5;
        int[] arr = genereta_massive(n);
        print_massive(arr);
        System.out.println(arr.length);

        int[] arr_ = delete_num(arr, 1);
        print_massive(arr_);
        System.out.println(arr_.length);
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

    public static int[] delete_num(int[] arr, int num) {
        // check length
        int length = 0;
        for (int elem : arr) {
            if (elem != num) {
                length += 1;
            }
        }

        int[] arr_ = new int[length];
        int j = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != num) {
                arr_[j] = arr[i];
                ++j;
            }
        }
        return arr_;
    }

}
