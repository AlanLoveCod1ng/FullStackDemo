package org.studyeasy.specs;

import org.studyeasy.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V6Engine")
public class V6 implements Engine {
    @Override
    public String type() {
        return "V6";
    }
}
