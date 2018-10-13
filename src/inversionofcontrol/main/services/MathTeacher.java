package inversionofcontrol.main.services;

import inversionofcontrol.main.entities.Employee;

public class MathTeacher implements Teacher {

    Employee emp;

    public MathTeacher(){
        emp = new Employee("Akash",28,"Math","CSE");
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
}
