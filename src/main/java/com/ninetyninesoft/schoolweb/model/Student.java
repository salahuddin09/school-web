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
public class Student extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    private StudentParent fathersName;
    @OneToOne
    private StudentParent mothersName;
    @OneToOne
    private StudentParent localGardian;
    private String address;
    private String gender;
    private String dateOfBirth;
    private String religion;
    private String bloodGroup;
    private String profilepic;
    @OneToOne
    private StudentAdmission activeAdmission;
    @OneToMany
    private Collection<StudentAdmission> historyAdmission;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentParent getFathersName() {
        return fathersName;
    }

    public void setFathersName(StudentParent fathersName) {
        this.fathersName = fathersName;
    }

    public StudentParent getMothersName() {
        return mothersName;
    }

    public void setMothersName(StudentParent mothersName) {
        this.mothersName = mothersName;
    }

    public StudentParent getLocalGardian() {
        return localGardian;
    }

    public void setLocalGardian(StudentParent localGardian) {
        this.localGardian = localGardian;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public StudentAdmission getActiveAdmission() {
        return activeAdmission;
    }

    public void setActiveAdmission(StudentAdmission activeAdmission) {
        this.activeAdmission = activeAdmission;
    }

    public Collection<StudentAdmission> getHistoryAdmission() {
        return historyAdmission;
    }

    public void setHistoryAdmission(Collection<StudentAdmission> historyAdmission) {
        this.historyAdmission = historyAdmission;
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ninetyninesoft.education.model.Student[ id=" + id + " ]";
    }
    
}
