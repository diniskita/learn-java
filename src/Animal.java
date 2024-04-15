
/* Classes Animal */
/*
   data member;
   constructor;
   method;
   nested class; e/ou Inner Class;
   interface;
   * */

public class Animal {

    protected static int count = 0; /* STATIC */
    protected int id; /* data member - int is var and att */
    protected String group; /* Mammals, fish, birds, reptiles, and amphibians, etc */
    protected String type; /* protected not visible in other packages */

    /* Constructor declaration of class */
    /* Private - Encapsulation - Get and Set to get values */
    public Animal(int id, String group, String type) {
        this.id = id;
        this.group = group;
        this.type = type;
        Animal.count += 1;
    }

    /* Method 1 GETTER */
    public String getType() {
        return type;
    }

    /* Method 1 SETTER */
    public void setType(String newType) {
        this.type = newType;
    }

    /* Method 3 */
    public void speak() {
        System.out.printf("%d %s %s\n", this.id, this.group, this.type);
    }

    /* Static Animal.display(); */
    public static void display() {
        System.out.println("Hey im a STATIC display!");
        System.out.println(count + " IDs");
    }
}
