package org.studyeasy.specs;

import org.studyeasy.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("engineType")
public class EngineType implements Engine {
    String type;

    public EngineType(){
        type = "Unknown";
    }

    public EngineType(String type){
        this.type = type;
    }

    @Override
    public String type() {
        return type;
    }
}
