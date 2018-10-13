package inversionofcontrol.main.services;

import inversionofcontrol.main.entities.Employee;

public class ScienceTeacher implements Teacher {

    Employee emp;

    public ScienceTeacher(){
        emp = new Employee("Hardy",26,"Science","CSE");
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
