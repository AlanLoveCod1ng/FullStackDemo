package org.studyeasy.specs;

import org.studyeasy.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V8Engine")
public class V8 implements Engine {
    @Override
    public String type() {
        return "V8";
    }
}
