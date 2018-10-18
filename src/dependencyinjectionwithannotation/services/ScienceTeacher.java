package dependencyinjectionwithannotation.services;

import dependencyinjectionwithannotation.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

    Employee emp;

    @Autowired
    @Qualifier("csehod")
    HOD hod;

    public ScienceTeacher(){
        emp = new Employee("Hardy",26,"Science","CSE");
    }

    public ScienceTeacher(String name,int age ,String department){
        emp = new Employee(name,age,"Science",department);
    }

    public ScienceTeacher(Employee emp){
        emp.setSubject("Science");
        this.emp = emp;
    }

    @Override
    public String getSubject() {
        return this.emp.getSubject();
    }

    @Override
    public int getAge() {
        return this.emp.getAge();
    }

    @Override
    public String getDepartment() {
        return this.emp.getDepartment();
    }

    @Override
    public Employee getEmployeeData() {
        return this.emp;
    }

    @Override
    public String getWokDetails(){
        return hod.assignWork();
    }

}
