package dependencyinjectionwithannotation.services;

import org.springframework.stereotype.Component;

@Component("csehod")
public class CSEHOD implements HOD {
    @Override
    public String assignWork() {
        return "Lectures from 12:00-2:00";
    }
}
