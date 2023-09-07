package Chapter12.Practice;

import java.util.ArrayList;

class Fruit { public String toString() { return "Fruit"; }}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}

class Juice {
    String name;
    Juice(String name) { this.name = name + "Juice"; }
    public String toString() { return name; }
}

class Jucier {
    static Juice makeJuice(FruitBox<? extends Object> box) {
        String tmp = "";

        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}


public class Pracetice12_3_FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println("fruitBox = " + Jucier.makeJuice(fruitBox));
        System.out.println("appleBox = " + Jucier.makeJuice(appleBox));
    }
}