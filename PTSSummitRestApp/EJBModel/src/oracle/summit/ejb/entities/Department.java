package oracle.summit.ejb.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({ @NamedQuery(name = "Department.findAll", query = "select o from Department o") })
@Table(name = "S_DEPT")
@XmlRootElement
public class Department implements Serializable {
    private static final long serialVersionUID = 5451372511949748970L;
    @Id
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false, unique = true, length = 25)
    private String name;
    @Column(name = "REGION_ID", unique = true)
    private Integer regionId;

    public Department() {
    }

    public Department(Integer id, String name, Integer regionId) {
        this.id = id;
        this.name = name;
        this.regionId = regionId;
    }

    @XmlElement
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}
