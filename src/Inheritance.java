public class Inheritance extends Animal {

    private String food;

    public Inheritance(int id, String group, String type, String food) {
        super(id, group, type);
        this.food = food;
    }

    /* Create same Inheritance to call without food parameter */
    public Inheritance(int id, String group, String type) {
        super(id, group, type);
        this.food = "hamburger";
    }

    public Inheritance(int id) {
        super(id, "Null", "Null");
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void speak() {
        System.out.printf("%d %s %s %s\n", this.id, this.group, this.type, this.food);
    }
}
