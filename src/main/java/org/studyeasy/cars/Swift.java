package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.studyeasy.interfaces.Car;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;

@Component("swift")
public class Swift implements Car {
    @Autowired
    @Qualifier(value = "engineType")
    Engine engine;
//    Corolla(Engine v8){
//        v8.setType("New V8");
//    }

    public String specs() {
        return "Sedan from Toyota "+ engine.type();
    }
}
