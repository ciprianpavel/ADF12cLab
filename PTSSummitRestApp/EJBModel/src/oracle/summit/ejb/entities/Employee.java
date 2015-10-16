package oracle.summit.ejb.entities;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import oracle.summit.ejb.adapter.yyyyMMddDateAdapter;

@Entity
@NamedQueries({ @NamedQuery(name = "Employee.findAll", query = "select o from Employee o") })
@Table(name = "S_EMP")
@XmlRootElement
public class Employee implements Serializable {
    private static final long serialVersionUID = -7866058557975052096L;
    private String comments;
    @Column(name = "COMMISSION_PCT")
    private Integer commissionPct;
    @Column(name = "DEPT_ID")
    private Integer deptId;
    @Column(length = 100)
    private String email;
    @Column(name = "FIRST_NAME", length = 25)
    private String firstName;
    @Id
    @Column(nullable = false)
    private Integer id;
    @Column(name = "LAST_NAME", nullable = false, length = 25)
    private String lastName;
    @Column(name = "MANAGER_ID")
    private Integer managerId;
    private Long salary;
    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "TITLE_ID")
    private BigDecimal titleId;
    @Column(unique = true, length = 8)
    private String userid;

    public Employee() {
    }

    public Employee(String comments, Integer commissionPct, Integer deptId, String email, String firstName, Integer id,
                    String lastName, Integer managerId, Long salary, Date startDate, BigDecimal titleId,
                    String userid) {
        this.comments = comments;
        this.commissionPct = commissionPct;
        this.deptId = deptId;
        this.email = email;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.managerId = managerId;
        this.salary = salary;
        this.startDate = startDate;
        this.titleId = titleId;
        this.userid = userid;
    }

    @XmlElement
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @XmlElement
    public Integer getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Integer commissionPct) {
        this.commissionPct = commissionPct;
    }

    @XmlElement
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @XmlElement
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @XmlElement
    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @XmlElement
    @XmlJavaTypeAdapter(yyyyMMddDateAdapter.class)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @XmlElement
    public BigDecimal getTitleId() {
        return titleId;
    }

    public void setTitleId(BigDecimal titleId) {
        this.titleId = titleId;
    }

    @XmlElement
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    
}
