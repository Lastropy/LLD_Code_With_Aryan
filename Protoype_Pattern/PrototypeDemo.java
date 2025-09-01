package LLD_CWA.Protoype_Pattern;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Character.clone_type = false; // Shallow Copy
        Character ch = new Character("C~", 2);
        Character ch2 = ch.clone();
        System.out.println("Increasing Clone's width");
        ch2.increaseWidth(55);
        System.out.println("String 1 Width: "+ch.widthKeeper.width);
        System.out.println("String 2 Width: "+ch2.widthKeeper.width);
    }
}
