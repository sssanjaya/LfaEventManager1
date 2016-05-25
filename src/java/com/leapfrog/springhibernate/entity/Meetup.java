/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "tbl_meetup", catalog = "lfa_event_manager", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meetup.findAll", query = "SELECT m FROM Meetup m"),
    @NamedQuery(name = "Meetup.findById", query = "SELECT m FROM Meetup m WHERE m.id = :id"),
    @NamedQuery(name = "Meetup.findByName", query = "SELECT m FROM Meetup m WHERE m.name = :name"),
    @NamedQuery(name = "Meetup.findByPresenter", query = "SELECT m FROM Meetup m WHERE m.presenter = :presenter"),
    @NamedQuery(name = "Meetup.findByAddedDate", query = "SELECT m FROM Meetup m WHERE m.addedDate = :addedDate"),
    @NamedQuery(name = "Meetup.findByModifiedDate", query = "SELECT m FROM Meetup m WHERE m.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "Meetup.findByLocation", query = "SELECT m FROM Meetup m WHERE m.location = :location"),
    @NamedQuery(name = "Meetup.findByStatus", query = "SELECT m FROM Meetup m WHERE m.status = :status")})
public class Meetup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(nullable = false, length = 65535)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String presenter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "added_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Column(name = "modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String location;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private boolean status;

    public Meetup() {
    }

    public Meetup(Integer id) {
        this.id = id;
    }

    public Meetup(Integer id, String name, String description, String presenter, Date addedDate, String location, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.presenter = presenter;
        this.addedDate = addedDate;
        this.location = location;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        if (!(object instanceof Meetup)) {
            return false;
        }
        Meetup other = (Meetup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.leapfrog.springhibernate.entity.Meetup[ id=" + id + " ]";
    }
    
}
