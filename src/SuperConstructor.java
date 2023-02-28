class Person{
    Person(){
        System.out.println("I am person class Constructor");
    }
}
class StudentId extends Person{
    StudentId(){
        super();
        System.out.println("I am StudentId class Constructor");
    }
}
public class SuperConstructor {
    public static void main(String [] args){
        StudentId student = new StudentId();
    }
}
