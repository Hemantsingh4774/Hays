class Student{
    private int roll_no;
    private String name;
    public int getRoll_no(){
        return roll_no;
    }
    public String getName(){
        return name;
    }
    public void setRoll_no(int roll_no){
        this.roll_no=roll_no;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Student s= new Student();
        s.setName("Rohan");
        s.setRoll_no(10);
        System.out.println(s.getName());
        System.out.println(s.getRoll_no());

    }
}
