class demo{

   private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

}
public  class getter_setter {
    public static void main(String[] args) {
        demo dobj = new demo();
        dobj.setName("Snehal");   
        System.out.println(dobj.getName());
    }
    //Encapsulation
}

