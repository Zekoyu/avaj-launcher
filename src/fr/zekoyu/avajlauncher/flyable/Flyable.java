package fr.zekoyu.avajlauncher.flyable;

import fr.zekoyu.avajlauncher.tower.WeatherTower;

// https://en.wikipedia.org/wiki/Class_diagram#Relationships
// A flyable can have zero or more towers
public interface Flyable {

    public void updateConditions() throws Exception;
    public void registerTower(WeatherTower weatherTower) throws Exception;
    
}