package dependencyinjectionwithannotation.config;

import dependencyinjectionwithannotation.entities.Employee;
import dependencyinjectionwithannotation.services.EnglishTeacher;
import dependencyinjectionwithannotation.services.ScienceTeacher;
import dependencyinjectionwithannotation.services.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("dependencyinjectionwithannotation")
@PropertySource(value = "classpath:Resources/spring.properties")
public class SpringConficuration {

    @Value("${scienceteachername}")
    private String name;

    @Value("${scienceteacherage}")
    private int age;

    @Value("${scienceteacherdept}")
    private String dept;

    @Bean
    public Employee getEmp1() {
        return new Employee("Sukhi", 23, "", "ECE");
    }

    @Bean
    public Employee getEmp2() {
        return new Employee(name, age, "", dept);
    }

    @Bean
    public Teacher getEnglishTeacher() {
        return new EnglishTeacher(getEmp1());
    }

    @Bean
    public Teacher getScienceTeacher() {
        return new ScienceTeacher(getEmp2());
    }
}
