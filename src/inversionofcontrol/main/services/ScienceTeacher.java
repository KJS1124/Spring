package inversionofcontrol.main.services;

import inversionofcontrol.main.entities.Employee;

public class ScienceTeacher implements Teacher {

    Employee emp;

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


}
