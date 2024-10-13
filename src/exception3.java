public class exception3 {
    //wehat if you want to create exception on your own.
    //handling the error
    public static void main(String[] args) {
        int i = 0  ;
        int j = 0;
        try{
            //here specifically we are calling catch like a fucntion
            if(i == 0 ) throw new ArithmeticException("this is from thow with love");


        }
        catch(ArithmeticException e){
            j = 19/1;
            System.out.println("thats the dafault aoutput"+ e);
            //instead of just sout we will handle it .
        }
        System.out.println(j);
    }
}
