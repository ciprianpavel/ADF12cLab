package oracle.summit.ejb;

import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import oracle.summit.ejb.entities.Department;
import oracle.summit.ejb.entities.Employee;

@Singleton(name = "SummitService", mappedName = "SummitService")
public class SummitServiceBean implements SummitServiceBeanLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "EJBModel")
    private EntityManager em;

    public SummitServiceBean() {
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        return em.merge(entity);
    }

    
    public Department findDepartment(Integer departmentId){
        
        if(departmentId != null) {
            return em.find(Department.class, departmentId);
        }
        
        return null;
    }
    
    public Employee findEmployee(Integer employeeId){
        
        if(employeeId != null) {
            return em.find(Employee.class, employeeId);
        }
        
        return null;
    }

    public Employee persistEmployee(Employee employee) {
        em.persist(employee);
        return employee;
    }

    public Employee mergeEmployee(Employee employee) {
        return em.merge(employee);
    }

    public void removeEmployee(Employee employee) {
        employee = em.find(Employee.class, employee.getId());
        em.remove(employee);
    }

    /** <code>select o from Employee o</code> */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Employee> getEmployeeFindAll() {
        return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
    }

    public Department persistDepartment(Department department) {
        em.persist(department);
        return department;
    }

    public Department mergeDepartment(Department department) {
        return em.merge(department);
    }

    public void removeDepartment(Department department) {
        department = em.find(Department.class, department.getId());
        em.remove(department);
    }

    /** <code>select o from Department o</code> */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Department> getDepartmentFindAll() {
        return em.createNamedQuery("Department.findAll", Department.class).getResultList();
    }
}
