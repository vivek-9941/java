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
//        ArrayList <Integer>  array  =new ArrayList<>();
        Map<String, Integer> mpp = new HashMap<>();
        mpp.put("vivek", 10);
        mpp.put("prapti" , 9);
        mpp.put("prson" , 11);



        System.out.println(mpp.keySet());
        System.out.println(mpp);


    }
}