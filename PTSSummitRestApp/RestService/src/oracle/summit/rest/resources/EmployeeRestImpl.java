package oracle.summit.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import oracle.summit.ejb.SummitServiceBeanLocal;
import oracle.summit.ejb.entities.Employee;
import oracle.summit.rest.resources.base.EmployeeImpl;

public class EmployeeRestImpl  extends EmployeeImpl {
    public EmployeeRestImpl() {
    }
    
    public EmployeeRestImpl(SummitServiceBeanLocal summitServiceLocal, List <Employee> employeeList){
        super(summitServiceLocal, employeeList);
    }

    @GET
    @Produces("application/json, application/xml")
    public Response getEmployeeList() {

        return super.getEmployeeList();
    }
    
    @GET
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    @Path("/{employeeId}")
    public Response findEmployee(@PathParam("employeeId") Integer employeeId){
        return super.findEmployee(employeeId);
    }

    @POST
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    public Response update(Employee updatedEmployee) {

        return super.updateEmployee(updatedEmployee);
    }

    @PUT
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    public Response create(Employee e) {

        return super.createEmployee(e);
    }

    @DELETE
    @Path("remove/{employeeId}")
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    public Response delete(@PathParam("employeeId") Integer employeeId) {

        return super.deleteEmployee(employeeId);
    }
    
    public void setEmployeeList(List<Employee> employeesList){
        super.setEmployeeList(employeesList);
    }
}
