/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author mikko
 */
@Entity
@Table(name="koulu")
public class Koulu {
    
    @Column(name="nimi")
    private String nimi;
    
    @Id
    @Column(name="ID")
    private int id;
    
    
    

    
}
