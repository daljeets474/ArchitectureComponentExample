package com.seehrasoftware.daggerimplemetation;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    Tyres provideTyres() {
        Tyres tyres=new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Wheels provideWheels(Tyres tyres,Rims rims){
        return new Wheels(tyres,rims);
    }

}
