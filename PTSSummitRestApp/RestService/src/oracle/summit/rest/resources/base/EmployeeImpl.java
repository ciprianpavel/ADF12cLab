package oracle.summit.rest.resources.base;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import oracle.summit.ejb.SummitServiceBeanLocal;
import oracle.summit.ejb.entities.Employee;
import oracle.summit.rest.lists.EmployeeList;


/**
 /**
 *  Its a design decision for this sample application to separate the REST annotations from the EJB access code. The
 *  benefit is that the sources are easier to read as if as if all code lines would be in a single file. This class is
 *  an EJB implementation class to provide data to the REST service
 *
 * //TODO add proper error handling and messages instead of throwing WebApplicationException
 */
public class EmployeeImpl {
    
    List<Employee> employeeList = null;
    SummitServiceBeanLocal summitServiceLocal = null;
    
    
    public EmployeeImpl(){};
    
    public EmployeeImpl(SummitServiceBeanLocal summitsServiceLocal, List<Employee> employeeList) {
        super();
        this.summitServiceLocal = summitsServiceLocal;
        this.employeeList = employeeList;
    }

    public void setEmployeeList(List<Employee> employeesList) {
        this.employeeList = employeesList;
    }

    public Response getEmployeeList() {
        if(employeeList == null){
           employeeList = summitServiceLocal.getEmployeeFindAll();
        }
        EmployeeList employeesList = new EmployeeList();
        employeesList.setEmployee(employeeList);
        return Response.ok(employeesList).build();
    }
    
    public Response deleteEmployee(Integer employeeId){
      Employee d =  summitServiceLocal.findEmployee(employeeId);
      
        //throw a resource not found exception
        if(d == null){
            WebApplicationException waex = new WebApplicationException("Employee "+employeeId+" not found",400);
            throw waex;
        }
            summitServiceLocal.removeEmployee(d);
      return Response.ok().build();
    }
    
    public Response updateEmployee(Employee updatedEmployee){
      Employee currentEmployee =  summitServiceLocal.findEmployee(updatedEmployee.getId());
      
      //throw a resource not found exception
      if(currentEmployee == null){
          WebApplicationException waex = new WebApplicationException("Employee "+updatedEmployee.getId()+" not found",400);
          throw waex;
      }
      
      currentEmployee.setId(updatedEmployee.getId());
      currentEmployee.setFirstName(updatedEmployee.getFirstName());
      currentEmployee.setLastName(updatedEmployee.getLastName());
      currentEmployee.setUserid(updatedEmployee.getUserid());
      currentEmployee.setEmail(updatedEmployee.getEmail());
      currentEmployee.setManagerId(updatedEmployee.getManagerId());
      currentEmployee.setDeptId(updatedEmployee.getDeptId());
      currentEmployee.setTitleId(updatedEmployee.getTitleId());
      currentEmployee.setStartDate(updatedEmployee.getStartDate());
      currentEmployee.setSalary(updatedEmployee.getSalary());
      currentEmployee.setCommissionPct(updatedEmployee.getCommissionPct());
      currentEmployee.setComments(updatedEmployee.getComments());
        
      Employee update = summitServiceLocal.mergeEmployee(currentEmployee);    
      
      return Response.ok(update).build();
    }
    
    public Response createEmployee(Employee d){
      Employee persistedEmployee = summitServiceLocal.persistEmployee(d);
      return Response.ok(persistedEmployee).build();
    }
    
    public Response findEmployee(Integer employeeId){
       Employee employee =  summitServiceLocal.findEmployee(employeeId); 
       
       //throw a resource not found exception
       if(employee == null){
           WebApplicationException waex = new WebApplicationException("Employee "+employeeId+" not found",400);
           throw waex;
       }
       
       //return list, which is easier to work with in MAF bindings
       ArrayList<Employee> employeeList = new ArrayList<Employee>();
       employeeList.add(employee);
       EmployeeList employeesList = new EmployeeList();
       employeesList.setEmployee(employeeList);
       return Response.ok(employeesList).build();
    }
    
}
