package oracle.summit.ejb;

import java.util.List;

import javax.ejb.Local;

import oracle.summit.ejb.entities.Department;
import oracle.summit.ejb.entities.Employee;

@Local
public interface SummitServiceBeanLocal {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);
   
    Department findDepartment(Integer departmentId);
    
    Employee findEmployee(Integer employeeId);
    
    Employee persistEmployee(Employee employee);

    Employee mergeEmployee(Employee employee);

    void removeEmployee(Employee employee);

    List<Employee> getEmployeeFindAll();

    Department persistDepartment(Department department);

    Department mergeDepartment(Department department);

    void removeDepartment(Department department);

    List<Department> getDepartmentFindAll();

}
