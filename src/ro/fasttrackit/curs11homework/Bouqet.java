package ro.fasttrackit.curs11homework;

import java.util.HashSet;
import java.util.Set;

public class Bouqet {
    private Set<String> bouqet;

    public Bouqet() {
        this.bouqet = new HashSet<>();
    }

    public Set<String> getAll() {
        return this.bouqet;
    }

    public void add(String flower) {
        this.bouqet.add(flower);
    }

    public void remove(String flower) {
        this.bouqet.remove(flower);
    }
}
