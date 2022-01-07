package org.studyeasy.cars;

import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {
    @Autowired
    @Qualifier(value = "V6Engine")
    Engine engine;
//    Corolla(Engine v8){
//        v8.setType("New V8");
//    }

    public String specs() {
        return "Sedan from Toyota "+engine.type();
    }
}
