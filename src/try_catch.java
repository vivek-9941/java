public class try_catch {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        try{
            //if error cames you cannot hanfle it you can only handle exceptions
            j  = 10 /i;
            //if exceptoin got here it will direectly jump to cathc block
            System.out.println(j);
        }
        catch(Exception e){
            System.out.println("value of i is 0");
        }

        System.out.println("code wil continue to execute");
    }
}
