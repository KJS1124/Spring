package dependencyinjectionwithannotation.services;

import dependencyinjectionwithannotation.entities.Employee;

public interface Teacher {
    public String getSubject();
    public int getAge();
    public String getDepartment();
    public Employee getEmployeeData();
    public String getWokDetails();
}
