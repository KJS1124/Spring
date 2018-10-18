package dependencyinjectionwithannotation.services;

import org.springframework.stereotype.Component;

@Component("ecehod")
public class ECEHOD implements HOD {
    @Override
    public String assignWork() {
        return "Lectures from 9:00-10:00";
    }
}
