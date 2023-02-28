public class Dog {
    int age;
    String name;
    public Dog(){
        this(12,"zeel");
        System.out.println("no argument constructor is called");
    }
    public Dog(int age, String name){
        this.age=age;
        this.name=name;

    }
    public Dog(Dog d){
        age=d.age;
        name=d.name;
    }
    void display(){
        System.out.println(age+" "+name);
    }
}
