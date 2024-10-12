 class calculate{
    int add(int x, int y){
        return x+y;
    }
}
public class funs {
    public int add(int x,int y){
        return x+y;
    }
    public static void display(){
        System.out.println("using directly");
    }
    public static void main(String[] args) {
       //calling by ,making the object
        funs obj = new funs();
        System.out.println(obj.add(10,20));


        //static using so no need of making object its part of the class
        display();

        //using function from other class
        calculate cl = new calculate();
        int a = cl.add(10,40);
        System.out.println(a);
    }
}
