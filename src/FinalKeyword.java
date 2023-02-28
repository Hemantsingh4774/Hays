
/*final*/class FinalA{
    public /*final*/ void fun (){

        System.out.println("I am function of FinalA");
    }
}

class FinalB extends FinalA{
    public void fun(){

        System.out.println("I am function of Final B");
    }
}
public class FinalKeyword extends FinalA{
    public static void main(String[] args) {
        final int CONST=7;
        FinalKeyword obj = new FinalKeyword();
        obj.fun();
    }
}