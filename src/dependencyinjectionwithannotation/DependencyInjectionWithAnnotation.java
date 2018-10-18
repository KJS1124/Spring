package dependencyinjectionwithannotation;

import dependencyinjectionwithannotation.config.SpringConficuration;
import dependencyinjectionwithannotation.services.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionWithAnnotation {
    public static void main(String agrs[]) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConficuration.class);

        //Create super class object
        Teacher teacher;

        //initialize it
        teacher = context.getBean("getEnglishTeacher",Teacher.class);

        // print data
        System.out.println(teacher.getEmployeeData());
        System.out.println(teacher.getWokDetails());

        // change object data with another teacher
        teacher = context.getBean("getScienceTeacher",Teacher.class);

        // print data
        System.out.println(teacher.getEmployeeData());
        System.out.println(teacher.getWokDetails());

        // change object data with another teacher
        teacher = context.getBean("mathTeacher",Teacher.class);

        // print data
        System.out.println(teacher.getEmployeeData());
        System.out.println(teacher.getWokDetails());


    }
}
