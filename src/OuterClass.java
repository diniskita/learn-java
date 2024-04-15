public class OuterClass {
    /* Inner Classes */
    public class InnerClass {
        public void display() {
            System.out.println("This is a inner class!");
        }
    }

    public void inner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
