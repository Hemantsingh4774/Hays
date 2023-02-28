// compile time polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        fun1();
        fun1(2);
    }
    public static void fun1(){
        System.out.println("I am function 1");
    }
    public static void fun1(int n){
        System.out.println("I am function "+ n);
    }

}
