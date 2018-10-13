package dependencyinjection;

import inversionofcontrol.main.services.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyDependencyInjectionWithPropertiesFile {
    public static void main(String agrs[]){

        // get application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dependencyinjection/springvalueinjectionwithpropertiesfile");

        //Create super class object
        Teacher teacher;

        //inject dependency
        teacher = (Teacher) context.getBean("english");

        // print data
        System.out.println(teacher.getEmployeeData());

        // change object data with another teacher
        teacher = (Teacher) context.getBean("science");;

        // print data
        System.out.println(teacher.getEmployeeData());

        // change object data with another teacher
        teacher = (Teacher) context.getBean("math");;

        // print data
        System.out.println(teacher.getEmployeeData());

    }
}
