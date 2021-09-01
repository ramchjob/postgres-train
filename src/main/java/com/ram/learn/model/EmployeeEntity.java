package com.ram.learn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name="employee", schema = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="email", nullable=false, length=200)
    private String email;
    
    @Column(name="dept_id") 
    private Long deptId;
    
    
    
    /*
     * @OneToOne
     * 
     * @JoinColumn(name="dept_id") private DepartmentEntity department;
     * 
     * 
     * public DepartmentEntity getDepartment() { return department; }
     * 
     * public void setDepartment(DepartmentEntity department) { this.department =
     * department; }
     */
    
}