package dependencyinjectionwithannotation.entities;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    String name;
    int age;
    String subject;
    String department;

    public Employee(String name, int age, String subject, String department) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.department = department;
    }

    public Employee(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", subject='" + subject + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
