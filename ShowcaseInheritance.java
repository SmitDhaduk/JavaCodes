import javax.sound.midi.Soundbank;

class Animal{
    String name;
    public void eat(){
        
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    
    public void dispaly(){
        System.out.println("I am "+name);
    }
}

public class ShowcaseInheritance {
    public static void main(String[] args) {

        // This code will how Inheritance works.
        Dog newDog = new Dog();

        newDog.eat();
        newDog.name = "Tommy";
        newDog.dispaly();

        
        
        
    }
    
}

