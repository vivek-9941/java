import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        Vector<Integer> arr = new Vector<>();
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5; i++){
            arr[i] = (sc.nextInt());
        }
        for(int i = 0 ; i< 5; i++){
            System.out.println(arr[i]);
        }
    }
}