import java.util.*;
public class Main {
    public static void mystery1(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i - 1)) {
                int element = list.get(i);
                list.remove(i);
                list.add(0, element);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(60);
        list.add(50);
        list.add(40);
        mystery1(list);
    }
}