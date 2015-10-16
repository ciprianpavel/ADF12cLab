package oracle.summit.rest.service;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.core.Response;

import oracle.summit.ejb.SummitServiceBeanLocal;

import oracle.summit.rest.resources.DepartmentRestImpl;
import oracle.summit.rest.resources.EmployeeRestImpl;


/**
 * summitRestService REST service class.
 *
 * Note: this REST service has been created for demonstration and testing puposes. Its not meant to be production
 * quality and instead expected to evolve over time with additional functionality that will close gaps that exist
 * in this current implementation (e.g. improved error and exception handling)
 * 
 * This class is the root service class that branches to two different REST implementation classes that implement 
 * CRUD operations for the departments and employees data in the Oracle HR schema. The architecture of this sample
 * is such that the implementation (which currently is EJB based) can be changed without impacting the service API
 *
 */
@Path("/")
@Singleton
public class SummitRestService {
    
    @EJB
    SummitServiceBeanLocal summitService;
    public SummitRestService() {
        super();
    }
    
    //method for testing the root resource
    @GET
    public Response rootUriOk(){
       return Response.ok().build();    
    }
    

    
    @Path("/department")
    public DepartmentRestImpl getAllDepartment(){
        return new DepartmentRestImpl(summitService, null);
    }
    
    @Path("/employee")
    public EmployeeRestImpl getAllEmployee(){
        return new EmployeeRestImpl(summitService, null);
    }
    

}
