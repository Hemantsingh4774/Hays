
class StudentMarks{
    int marks=90;
    public void fun(){
        System.out.println("This is StudentMarks class.");
    }
}
class Marks extends StudentMarks{
    int marks=95;
    public void display(){
        super.fun();
        function();
        System.out.println("The marks are:"+super.marks);
    }
    public void function(){
        System.out.println("This is Marks class.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Marks obj = new Marks();
        obj.display();
    }
}