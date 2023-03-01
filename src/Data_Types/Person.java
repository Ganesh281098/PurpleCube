package Data_Types;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void printInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 30);
        
        p1.printInfo();
        p2.printInfo();
        
        p1.setName("Johnny");
        p2.setAge(31);
        
        p1.printInfo();
        p2.printInfo();
    }
}
