abstract class Animal
{
    public abstract void animalSound();

    public void sleep()
    {
        System.out.println("zzz");
    }
}
class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The .....");
    } 
}


public class abstraction_example {
    public static void main(String[] args) {
       Dog d = new Dog();
       d.animalSound();
       d.sleep();
    }   
}
