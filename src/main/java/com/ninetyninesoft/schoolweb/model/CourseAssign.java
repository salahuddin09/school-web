/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninetyninesoft.schoolweb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author ASUS
 */

@Entity
public class CourseAssign extends EntityBase implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Class assignedClass;
    @OneToOne
    private Section assignedClassSection;
    @OneToOne
    private Subject assignedClassSubject;
    @OneToOne
    private Teacher assignedSubjectTeacher;
    private Integer sessionYear;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Class getAssignedClass() {
        return assignedClass;
    }

    public void setAssignedClass(Class assignedClass) {
        this.assignedClass = assignedClass;
    }

    public Section getAssignedClassSection() {
        return assignedClassSection;
    }

    public void setAssignedClassSection(Section assignedClassSection) {
        this.assignedClassSection = assignedClassSection;
    }

    public Subject getAssignedClassSubject() {
        return assignedClassSubject;
    }

    public void setAssignedClassSubject(Subject assignedClassSubject) {
        this.assignedClassSubject = assignedClassSubject;
    }

    public Teacher getAssignedSubjectTeacher() {
        return assignedSubjectTeacher;
    }

    public void setAssignedSubjectTeacher(Teacher assignedSubjectTeacher) {
        this.assignedSubjectTeacher = assignedSubjectTeacher;
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
        if (!(object instanceof CourseAssign)) {
            return false;
        }
        CourseAssign other = (CourseAssign) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ninetyninesoft.education.model.CourseAssign[ id=" + id + " ]";
    }
    
}
