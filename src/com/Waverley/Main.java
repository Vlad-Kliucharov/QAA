package com.Waverley;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //MuscleCar Mustang
        MuscleCar Mustang = new MuscleCar();
        Mustang.car_parametrs();
        System.out.println("Car name " + Mustang.car_name + ", " + "Engine capacity " + Mustang.car_engine_capacity + " HP");
        Mustang.start_engine();
        System.out.println("Start race 'Engine launch' " + Mustang.engineState);
        Mustang.car_start_speed();
        System.out.println("Speed on start " + Mustang.car_start_speed);
        Mustang.overclocking();
        System.out.println("Overclocking to 100 km/h " + Mustang.acceleration_to_100);
        Mustang.pick_up_max_speed();
        System.out.println("Max speed " + Mustang.car_max_speed);
        Mustang.stop_engine();
        System.out.println("Race over 'Engine stop' " + Mustang.engineState);

        System.out.println("-----------------------------------------------------------------------------------");

        //SportCar Ferrari
        SportsCar Ferrari = new SportsCar();
        Ferrari.car_parametrs();
        System.out.println("Car name " + Ferrari.car_name + ", " + "Engine capacity " + Ferrari.car_engine_capacity + " HP");
        Ferrari.start_engine();
        System.out.println("Start race 'Engine launch' " + Ferrari.engineState);
        Ferrari.car_start_speed();
        System.out.println("Speed on start " + Ferrari.car_start_speed);
        Ferrari.overclocking();
        System.out.println("Overclocking to 100 km/h " + Ferrari.acceleration_to_100);
        Ferrari.pick_up_max_speed();
        System.out.println("Max speed " + Ferrari.car_max_speed);
        Ferrari.stop_engine();
        System.out.println("Race over 'Engine stop' " + Ferrari.engineState);
    }

}
