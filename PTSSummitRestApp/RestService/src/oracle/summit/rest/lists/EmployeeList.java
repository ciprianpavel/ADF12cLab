package oracle.summit.rest.lists;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import oracle.summit.ejb.entities.Employee;

/**
 * Helper class that allows a list of type <Countries> to be unmarshall into a XML file.
 */
@XmlRootElement(name="empss")
public class EmployeeList {
    List<Employee> employee;


    public EmployeeList(){};
        
    public EmployeeList(List<Employee> empin) {
        super();
        this.employee = empin;
    }


    public void setEmployee(List<Employee> employees) {
        this.employee = employees;
    }

    @XmlElement(name="emps")
    public List<Employee> getEmployee() {
        return employee;
    }

}