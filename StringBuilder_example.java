public class StringBuilder_example {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Tony");
       // String str = "Tony";
        System.out.println(str);
        System.out.println(str.charAt(1));
        str.setCharAt(0,'p');
        System.out.println(str);
        str.insert(0,'s');
        System.out.println(str);
        str.delete(1, 3);
         System.out.println(str);
    }
}
