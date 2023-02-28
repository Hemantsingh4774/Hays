
public abstract class Sample{

    public void print()
    {
        System.out.println("This is an method of abstract class");
    }

}

class Mainn{
    public static void main(String [] args){

        Sample objA = new Sample(){};
        objA.print();
    }
}
