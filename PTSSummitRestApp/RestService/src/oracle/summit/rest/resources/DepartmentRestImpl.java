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
import oracle.summit.ejb.entities.Department;
import oracle.summit.rest.resources.base.DepartmentImpl;

public class DepartmentRestImpl  extends DepartmentImpl {
    public DepartmentRestImpl() {
    }
    
    public DepartmentRestImpl(SummitServiceBeanLocal summitServiceLocal, List <Department> departmentList){
        super(summitServiceLocal, departmentList);
    }

    @GET
    @Produces("application/json, application/xml")
    public Response getDepartmentList() {

        return super.getDepartmentList();
    }
    
    @GET
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    @Path("/{departmentId}")
    public Response findDepartment(@PathParam("departmentId") Integer departmentId){
        return super.findDepartment(departmentId);
    }

    @POST
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    public Response update(Department updatedDepartment) {

        return super.updateDepartment(updatedDepartment);
    }

    @PUT
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    public Response create(Department d) {

        return super.createDepartment(d);
    }

    @DELETE
    @Path("remove/{departmentId}")
    @Produces("application/json, application/xml")
    @Consumes("application/json, application/xml")
    public Response delete(@PathParam("departmentId") Integer departmentId) {

        return super.deleteDepartment(departmentId);
    }
    
    public void setDepartmentList(List<Department> departmentsList){
        super.setDepartmentList(departmentsList);
    }
}
