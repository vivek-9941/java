public class exception2 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int i =10 ;
        String str = null;
        int j ;
        //heree we are doning multiple catch blocks
        //with single try block
        //i.e will catch different exceptions for differcent errors
        try{
            //1st exception
            j = 10/i;

            //2nd
            System.out.println(nums[4]);
            System.out.println("hello ");

            //3rd not known the tyoe
            System.out.println(str.length());
        }
        catch (ArithmeticException e){
            System.out.println("value of i is 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("inccorect access to the array");
        }

        //img:: this class should be at the end beaouse this is parent of all  exceptions classes so
        //if we put it at start others wont be executed

        catch(Exception e){
            System.out.println("something went wrong with the string ");
        }
        System.out.println("eveything is ok");
    }
}
