package Project.Services;

import Project.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeebyId(long id);
}
