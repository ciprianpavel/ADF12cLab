package oracle.summit.rest.resources.base;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import oracle.summit.ejb.SummitServiceBeanLocal;
import oracle.summit.ejb.entities.Department;
import oracle.summit.rest.lists.DepartmentList;


/**
 /**
 *  Its a design decision for this sample application to separate the REST annotations from the EJB access code. The
 *  benefit is that the sources are easier to read as if as if all code lines would be in a single file. This class is
 *  an EJB implementation class to provide data to the REST service
 *
 * //TODO add proper error handling and messages instead of throwing WebApplicationException
 */
public class DepartmentImpl {
    
    List<Department> departmentList = null;
    SummitServiceBeanLocal summitServiceLocal = null;
    
    
    public DepartmentImpl(){};
    
    public DepartmentImpl(SummitServiceBeanLocal summitsServiceLocal, List<Department> departmentList) {
        super();
        this.summitServiceLocal = summitsServiceLocal;
        this.departmentList = departmentList;
    }

    public void setDepartmentList(List<Department> departmentsList) {
        this.departmentList = departmentsList;
    }

    public Response getDepartmentList() {
        if(departmentList == null){
           departmentList = summitServiceLocal.getDepartmentFindAll();
        }
        DepartmentList departmentsList = new DepartmentList();
        departmentsList.setDepartment(departmentList);
        return Response.ok(departmentsList).build();
    }
    
    public Response deleteDepartment(Integer departmentId){
      Department d =  summitServiceLocal.findDepartment(departmentId);
      
        //throw a resource not found exception
        if(d == null){
            WebApplicationException waex = new WebApplicationException("Department "+departmentId+" not found",400);
            throw waex;
        }
            summitServiceLocal.removeDepartment(d);
      return Response.ok().build();
    }
    
    public Response updateDepartment(Department updatedDepartment){
      Department currentDepartment =  summitServiceLocal.findDepartment(updatedDepartment.getId());
      
      //throw a resource not found exception
      if(currentDepartment == null){
          WebApplicationException waex = new WebApplicationException("Department "+updatedDepartment.getId()+" not found",400);
          throw waex;
      }
      
      currentDepartment.setId(updatedDepartment.getId());
      currentDepartment.setName(updatedDepartment.getName());
      currentDepartment.setRegionId(updatedDepartment.getRegionId());
        
      Department update = summitServiceLocal.mergeDepartment(currentDepartment);    
      
      return Response.ok(update).build();
    }
    
    public Response createDepartment(Department d){
      Department persistedDepartment = summitServiceLocal.persistDepartment(d);
      return Response.ok(persistedDepartment).build();
    }
    
    public Response findDepartment(Integer departmentId){
       Department department =  summitServiceLocal.findDepartment(departmentId); 
       
       //throw a resource not found exception
       if(department == null){
           WebApplicationException waex = new WebApplicationException("Department "+departmentId+" not found",400);
           throw waex;
       }
       
       //return list, which is easier to work with in MAF bindings
       ArrayList<Department> departmentList = new ArrayList<Department>();
       departmentList.add(department);
       DepartmentList departmentsList = new DepartmentList();
       departmentsList.setDepartment(departmentList);
       return Response.ok(departmentsList).build();
    }
    
}

