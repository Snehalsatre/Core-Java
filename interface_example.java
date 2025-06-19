 interface person {

    abstract void fly();
    abstract void bark();
}
class Man implements person{
    public void fly(){
        System.out.println("java");
    }
}
public class interface_example {
    public static void main(String[] args) {
        Man mn = new Man();
        mn.fly();
      //  mn.bark();
    }
}
