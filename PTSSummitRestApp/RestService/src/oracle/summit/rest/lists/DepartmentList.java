package oracle.summit.rest.lists;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import oracle.summit.ejb.entities.Department;

/**
 * Helper class that allows a list of type <Countries> to be unmarshall into a XML file.
 */
@XmlRootElement(name="deptss")
public class DepartmentList {
    
    List<Department> department;

    public void setDepartment(List<Department> deptin) {
        this.department = deptin;
    }

    @XmlElement(name="depts")
    public List<Department> getDepartment() {
        return department;
    }

    public DepartmentList() {
        super();
    }
}
