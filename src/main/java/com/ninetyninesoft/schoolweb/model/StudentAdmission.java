/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninetyninesoft.schoolweb.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ASUS
 */

@Entity
public class StudentAdmission extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String studentID;
    @OneToOne
    private Student enrolledStudent;
    @OneToOne
    private Class enrolledClass;
    @OneToOne
    private Section enrolledSection;
    @OneToMany
    private Collection<CourseAssign> assignedCourses;
    private Integer sessionYear;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Student getEnrolledStudent() {
        return enrolledStudent;
    }

    public void setEnrolledStudent(Student enrolledStudent) {
        this.enrolledStudent = enrolledStudent;
    }

    public Class getEnrolledClass() {
        return enrolledClass;
    }

    public void setEnrolledClass(Class enrolledClass) {
        this.enrolledClass = enrolledClass;
    }

    public Section getEnrolledSection() {
        return enrolledSection;
    }

    public void setEnrolledSection(Section enrolledSection) {
        this.enrolledSection = enrolledSection;
    }

    public Collection<CourseAssign> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(Collection<CourseAssign> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }

    public Integer getSessionYear() {
        return sessionYear;
    }

    public void setSessionYear(Integer sessionYear) {
        this.sessionYear = sessionYear;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentAdmission)) {
            return false;
        }
        StudentAdmission other = (StudentAdmission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ninetyninesoft.education.model.StudentAdmission[ id=" + id + " ]";
    }
    
}
