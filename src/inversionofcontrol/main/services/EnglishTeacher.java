package inversionofcontrol.main.services;

import inversionofcontrol.main.entities.Employee;

public class EnglishTeacher implements Teacher {
    Employee emp;

    public EnglishTeacher(){
        emp = new Employee("Rossy",23,"English","ECE");
    }

    public EnglishTeacher(String name,int age ,String department){
        emp = new Employee(name,age,"English",department);
    }

    public EnglishTeacher(Employee emp){
        emp.setSubject("English");
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
