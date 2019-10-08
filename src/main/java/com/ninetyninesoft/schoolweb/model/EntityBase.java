/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninetyninesoft.schoolweb.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 *
 * @author ASUS
 */

@MappedSuperclass
public class EntityBase {
    
    @OneToOne
    User createdUser;
    
    @OneToOne
    User modifiedUser;
    
    Date dateCreated;
    Date dateModified;

    Boolean isActive;
    Boolean isDeleted;
}
