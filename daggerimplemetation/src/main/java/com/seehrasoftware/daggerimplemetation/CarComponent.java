package com.seehrasoftware.daggerimplemetation;

import dagger.Component;

@Component(modules = {WheelModule.class})
public interface CarComponent {
    Car getCar();

    void injectMainActivity(MainActivity mainActivity);
}
