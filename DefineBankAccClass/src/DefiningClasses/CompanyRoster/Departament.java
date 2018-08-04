package DefiningClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Departament {
   private List<Employee> employeeList = new ArrayList<>();

    public Departament(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployees(Employee employees) {
        this.employeeList.add(employees);
    }
}
