package com.cacha.managebean;

import com.cacha.entidades.Gestion;

import com.cacha.session.GestionFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "canchaManagedBean")
@ViewScoped
public class CanchaManagedBean implements Serializable, ManageBeanInterfaces<Gestion> {

    @EJB

    private GestionFacadeLocal gestionFacadeLocal;

    private List<Gestion> listaCancha;

    private Gestion cancha;

    public CanchaManagedBean() {
        
    }

    @PostConstruct
    public void init() {

        listaCancha = gestionFacadeLocal.findAll();
        
    }

    @Override
    public void nuevo() {
        System.out.println("-----------------------------");
       cancha =new Gestion();
    }

   
    @Override
    public void grabar() {
        try {
            if (cancha.getId() == null) {
                gestionFacadeLocal.create(cancha);
            } else {
                gestionFacadeLocal.edit(cancha);
            }
            cancha = null;
            listaCancha = gestionFacadeLocal.findAll();
            mostrarMnesajeTry("Informacion Exitosa", FacesMessage.SEVERITY_ERROR);

        } catch (Exception e) {
            mostrarMnesajeTry("Ocurrio un error", FacesMessage.SEVERITY_ERROR);

        }

    }

    @Override
    public void seleccionar(Gestion t) {
        cancha = t;
    
    }

    @Override
    public void eliminar(Gestion t) {
        try {
            gestionFacadeLocal.remove(t);
            listaCancha = gestionFacadeLocal.findAll();
           mostrarMnesajeTry("Eliminado Exitoso", FacesMessage.SEVERITY_ERROR);
        } catch (Exception e) {
            mostrarMnesajeTry("Ocurio un erro", FacesMessage.SEVERITY_ERROR);
        }
        
    }

    @Override
    public void cancelar() {
        cancha = null;
        listaCancha = gestionFacadeLocal.findAll();

    }
    
    
    public List<Gestion> getListaCancha() {
        return listaCancha;
    }

    public void setListaCancha(List<Gestion> listaCancha) {
        this.listaCancha = listaCancha;
    }

    public Gestion getCancha() {
        return cancha;
    }

    public void setCancha(Gestion cancha) {
        this.cancha = cancha;
    }
}
