package fr.zekoyu.avajlauncher.tower;

import fr.zekoyu.avajlauncher.aircraft.Coordinates;
import fr.zekoyu.avajlauncher.provider.WeatherProvider;

public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    // default visibility is package private
    void changeWeather() throws Exception {
        this.conditionsChanged();
    }

}