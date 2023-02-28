class A{
    public void fun(){
        System.out.println("I am function of class A");
    }
}
class B extends A{
    public void fun(){
        System.out.println("I am function of Class B");
    }
}
public class PolymorphismRuntime {
    public static void main(String[] args) {
        B objB = new B();
        objB.fun();
    }
}
