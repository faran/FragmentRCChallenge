package com.softs.mt.fragmentrcchallenge;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by fkha0003 on 14/01/2019.
 */

public class ApplicationClass extends Application {

    public static ArrayList<CarMan> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<>();
        cars.add(new CarMan("Volkswagen", "POLO", "Chuck Nottis", "0987654321"));
        cars.add(new CarMan("Mercedes", "E200", "Idris Elba","3335554478"));
        cars.add(new CarMan("Nissan", "Almera", "Trevor Noah","777884455669"));
        cars.add(new CarMan("Mercedes", "E180", "Ali Wong","66655544477"));
        cars.add(new CarMan("Volkswagen", "GOLF", "Kathrne Ryan", "999555444"));
        cars.add(new CarMan("Nissan", "Prius", "Ryan", "111155555"));

    }
}
