package inversionofcontrol.main;

import inversionofcontrol.main.services.EnglishTeacher;
import inversionofcontrol.main.services.MathTeacher;
import inversionofcontrol.main.services.ScienceTeacher;
import inversionofcontrol.main.services.Teacher;

public class InversionOfControl {
    public static void main(String agrs[]){
        //Create super class object
        Teacher teacher;

        //initialize it
        teacher = new EnglishTeacher();

        // print data
        System.out.println(teacher.getEmployeeData());

        // change object data with another teacher
        teacher = new ScienceTeacher();

        // print data
        System.out.println(teacher.getEmployeeData());

        // change object data with another teacher
        teacher = new MathTeacher();

        // print data
        System.out.println(teacher.getEmployeeData());


    }
}
