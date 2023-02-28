public abstract class Test {
    int roll_no=10;
    abstract void fun();
}

class BClass extends  Test{
    void fun(){
        System.out.println("Hello");
    }
}

class MyMain{
    public static void main(String[] args) {
        BClass objB = new BClass();
        objB.roll_no=12;
        System.out.println(objB.roll_no);
    }
}

