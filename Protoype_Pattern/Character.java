package LLD_CWA.Protoype_Pattern;

public class Character implements Cloneable {
    static boolean clone_type = true;
    public static void setCloneType(boolean shallowClone) {
        Character.clone_type = shallowClone;
    }

    String repr;
    WidthKeeper widthKeeper;
    Character(String _repr, int _width) {
        repr = _repr;
        widthKeeper = new WidthKeeper(_width);
    }

    public Character clone() throws CloneNotSupportedException {
        if(Character.clone_type) {
            System.out.println("Making Shallow Copy");
            return (Character)(super.clone()); // Shallow Copy
        } else {
            System.out.println("Making Deep Copy");
            return new Character(this.repr, this.widthKeeper.width); // Deep Copy
        }
    }

    public void increaseWidth(int amt){
        this.widthKeeper.width+= amt;
    }

    public int getWidth() {
        return this.widthKeeper.width;
    }
}
