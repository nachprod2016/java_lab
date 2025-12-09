public class Animal {
    protected String name;
    protected int age;
    
    protected Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    protected String getName(){
        return name;
    }
    
    protected int getAge(){
        return age;
    }
    
    protected void makeSound(){
        System.out.println("nothing");
    }
}