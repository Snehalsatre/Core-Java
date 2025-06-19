class Plane{
    void fly(){
        System.out.println("plane");
    }

    void display(){
        System.out.println("Dispaly");
    }
}
class PassangerPlane extends Plane {
    void fly(){
        System.out.println("Passanger Plane");
    }

    
}
class FighterPlane extends PassangerPlane {
    void fly(){
        System.out.println("Fighter Plane");
    }
}
class Airport{
    static void prmint(Plane ref){
        ref.fly();
        ref.display();
    }
}
public class Demo3{
    public static void main(String[] args) {
     PassangerPlane  pp = new PassangerPlane();
      FighterPlane fp = new FighterPlane();
      pp.fly();
      //fp.fly();
      
       Plane ref;
       ref = pp;
   // ((PassangerPlane)(ref)).display();

        Airport.prmint(pp);
        Airport.prmint(fp);
   }
}