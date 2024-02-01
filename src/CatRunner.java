import java.util.*;
public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Snowball"));
        cats.add(new Cat("Furrball"));
        cats.add(new Cat("Kurt"));
        System.out.println(cats);

        Cat cat4 = new Cat("Jacky");
        Cat replacedCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replacedCat);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i++) {
            String name = cats.get(i).getName();
            cats.get(i).setName(name.toUpperCase());
        }
        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
