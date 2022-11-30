package fr.zekoyu.avajlauncher.tower;

import java.util.List;
import java.util.ArrayList;

import fr.zekoyu.avajlauncher.flyable.Flyable;

public class Tower {

    private List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected void conditionsChanged() throws Exception {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updateConditions();
        }
    }

}