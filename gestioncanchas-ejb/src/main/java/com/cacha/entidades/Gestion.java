/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacha.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author Freddy-PC
 */
@Entity
@Table(name = "gestion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gestion.findAll", query = "SELECT g FROM Gestion g")
    , @NamedQuery(name = "Gestion.findById", query = "SELECT g FROM Gestion g WHERE g.id = :id")
    , @NamedQuery(name = "Gestion.findByNombre", query = "SELECT g FROM Gestion g WHERE g.nombre = :nombre")
    , @NamedQuery(name = "Gestion.findByApellido", query = "SELECT g FROM Gestion g WHERE g.apellido = :apellido")
    , @NamedQuery(name = "Gestion.findByCancha", query = "SELECT g FROM Gestion g WHERE g.cancha = :cancha")
    , @NamedQuery(name = "Gestion.findByFecha", query = "SELECT g FROM Gestion g WHERE g.fecha = :fecha")
    , @NamedQuery(name = "Gestion.findByHora", query = "SELECT g FROM Gestion g WHERE g.hora = :hora")
    , @NamedQuery(name = "Gestion.findByDescripcion", query = "SELECT g FROM Gestion g WHERE g.descripcion = :descripcion")})
public class Gestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 50)
    @Column(name = "cancha")
    private String cancha;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 10)
    @Column(name = "hora")
    private String hora;
    @Size(max = 80)
    @Column(name = "descripcion")
    private String descripcion;

    public Gestion() {
    }

    public Gestion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCancha() {
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof Gestion)) {
            return false;
        }
        Gestion other = (Gestion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cacha.entidades.Gestion[ id=" + id + " ]";
    }
    
}
