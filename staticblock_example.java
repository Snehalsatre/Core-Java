 class demo {
    int a = 10;
    int b = 40;
    int c = 0;

    static{
        System.out.println("This is static block");
    }
    int add(){
        c= a+b;
        return c;
    }
}
public class staticblock_example{
    public static void main(String[] args) {
        demo dobj = new demo();
        System.out.println(dobj.add());
    }
}