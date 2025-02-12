package OOP.accessControl.package1;

public class Class1 {
    public int var1 = -1;
    protected int var2 = -1;
    private static int var3 = -1;
    int var4 = -1;

    public static void main(String[] args) {
        Class1 obj = new Class1();
        System.out.println(obj.var1);
        System.out.println(obj.var2);
        System.out.println(obj.var3);
        System.out.println(obj.var4);

        System.out.println(Class1.var3);
    }

    protected void print(){
        System.out.println("hello from Class1");
    }
}
