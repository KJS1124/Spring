package dependencyinjectionwithannotation.services;

import dependencyinjectionwithannotation.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

    Employee emp;

    @Autowired
    @Qualifier("csehod")
    HOD hod;

    public MathTeacher(){
        emp = new Employee("Akash",28,"Math","CSE");
    }

    public MathTeacher(String name,int age ,String department){
        emp = new Employee(name,age,"Math",department);
    }

    public MathTeacher(Employee emp){
        emp.setSubject("Math");
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
