package ro.fasttrackit.curs11homework;

import java.util.*;

public class Basket {
    private List<String> fruits;

    public Basket() {
        this.fruits = new ArrayList<>();
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        return this.fruits.remove(fruit);
    }

    public int position(String fruit) {
        for (int i = 0; i < this.fruits.size(); i++) {
            if (this.fruits.get(i).equals(fruit)) {
                return i;
            }
        }
        return 0;
    }

    public Collection<String> distinct() {
        Set<String> distBasket = new HashSet<>();
        for (String elem : this.fruits) {
            distBasket.add(elem);
        }
        return distBasket;
    }

    public void add(String fruit) {
        this.fruits.add(fruit);
    }

    public int count() {
        return this.fruits.size();
    }

    public int customCount() {
        int i;
        for (i = 0; i < this.fruits.size(); i++) ;
        return i;
    }
}
