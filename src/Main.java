/*
 * Learn Java - OOP
 * */

import java.util.*;

public class Main {

    /* Inheritance */

    public static void OOP() {
        /* Classes and Objects
         * */
        Animal duck = new Animal(1, "Bird", "duck");
        Animal bear = new Animal(2, "Mammal", "bear");
        Animal lizard = new Animal(3, "Reptile", "lizard");
        System.out.println(Animal.count + " IDs were created!");
        Animal.display();
        System.out.println(duck.getType());
        duck.speak();
        bear.speak();
        lizard.speak();
        duck.setType("Duckaroo");
        duck.speak();

        Animal human1 = new Inheritance(4, "Humanoid", "Human", "pizza");
        human1.speak();

        Animal human2 = new Inheritance(5, "Humanoid", "Human");
        Animal human3 = new Inheritance((6));

        human2.speak();
        human3.speak();

        /* Overloading methods and Object Comparison */
        Student dinis = new Student("Dinis");
        Student susana = new Student("Dinis");
        Student gustavo = new Student("Gustavo");

        System.out.println(dinis.equals(susana));
        System.out.println(dinis.compareTo(gustavo) > 0);
        System.out.println(dinis); /* dinis.toString(); */

        /* Inner Classes */

        OuterClass out = new OuterClass();
        /* out.inner();
         * System.out.println(); */
        OuterClass.InnerClass OuIn = out.new InnerClass();
        OuIn.display();

        Car toyota = new Car();
        toyota.speedUp(10);
        toyota.changeGear(2);
        toyota.display();
        toyota.speedUp(20);
        toyota.changeGear(3);
        toyota.display();

        int value = VehicleInterface.math(5);
        System.out.println(value);

        LevelEnum lvl = LevelEnum.Medium;
        String word = lvl.toString();
        LevelEnum[] array = LevelEnum.values();

        if (lvl == LevelEnum.Low) System.out.println(lvl);
        else if (lvl == LevelEnum.Medium) System.out.println(lvl);
        else System.out.println(lvl);

        /* System.out.println(LevelEnum.values()); */

        for (LevelEnum i : array) {
            System.out.println(i);
        }

        System.out.println(lvl.getLvl());
        System.out.println(LevelEnum.valueOf("Low"));

        lvl.setLvl(5);
        System.out.println(lvl.getLvl());
    }

    public static void method(String name, int age) {
        System.out.printf("Name: %s\n" + "Number: %d\n", name, age);
    }

    public static int methodAdd(int a, int b) {
        return a + b;
    }

    private static void setsAndLists() {
        Set<Integer> t = new HashSet<>();

        /* TreeSet Ordenado
           LinkedHashSet Rápido
           LinkedList Rápido
        * */

        t.add(1);
        t.add(5);
        t.add(2);
        t.add(8);
        t.add(6);
        t.remove(1);

        int size = t.size();
        boolean bool = t.contains(8);
        System.out.print("HashSet\n" + t + "\n" + size + "\n" + bool + "\nArraylist\n");

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.set(1, 5); /* set(index, element) */
        l.set(0, 8);
        System.out.println(l);
        System.out.println(l.subList(0, 2));
    }

    private static void mapsAndHashMaps() {
        /* Key matched pairs */
        Map M = new HashMap();

        M.put("Dinis", 16567);
        M.put(10, 123);
        /* System.out.println(M); */
        System.out.println(M.get("Dinis") + "\n" + M.get(10));

        /* Ordenado */
        Map T = new TreeMap();
        T.put("B", 16567);
        T.put("A", 123);
        System.out.println(T);

        /* Ordem de Entrada */
        Map H = new LinkedHashMap();
        H.put("A", 16567);
        H.put("B", 123);
        /* H.remove("Key"); */
        System.out.println(H);

        System.out.println(M.containsValue(16567));
        System.out.println(M.containsKey("Dinis"));
        System.out.println(M.values());
        /* M.isEmpty(); */
        /* Maps Example */

        Map strMap = new HashMap();
        String str = "hello my name is kita and i am cool";
        /* Converter String para Char Array */
        System.out.println(str.toCharArray());

        for (char c : str.toCharArray()) {
            if (strMap.containsKey(c)) {
                int value = (int) strMap.get(c);
                strMap.put(c, value + 1);
            } else {
                strMap.put(c, 1);
            }
        }
        strMap.remove(' ');
        System.out.println(strMap);

        /* Sorting */
        int[] array = {2, 5, 1, 8, 4, 0, 3, 6, 7, 9};
        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* setsAndLists();
         * mapsAndHashMaps();
         * method("Dinis", 16567);
         * System.out.println(methodAdd(10, 90));
         * */

        OOP();
        System.exit(0);
    }
}