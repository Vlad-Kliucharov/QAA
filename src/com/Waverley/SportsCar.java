package com.Waverley;

public class SportsCar {
    String car_name = "Ferrari";
    int car_engine_capacity = 1650;
    float acceleration_to_100 = 2.3f;
    int car_start_speed;
    int car_max_speed;
    boolean engineState = false;

    public void car_parametrs(){
        car_name = this.car_name;
        car_engine_capacity = this.car_engine_capacity;
    }

    public void start_engine(){
        engineState = true;
    }

    public void car_start_speed(){
        car_start_speed = 0;
    }

    public void overclocking(){
        acceleration_to_100 = this.acceleration_to_100;
    }

    public void pick_up_max_speed(){
        car_max_speed = 400;
    }

    public void stop_engine(){
        engineState = !false;
    }
}
