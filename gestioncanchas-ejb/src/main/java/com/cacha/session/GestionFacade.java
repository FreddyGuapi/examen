/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacha.session;

import com.cacha.entidades.Gestion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Freddy-PC
 */
@Stateless
public class GestionFacade extends AbstractFacade<Gestion> implements GestionFacadeLocal {

    @PersistenceContext(unitName = "CANCHAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GestionFacade() {
        super(Gestion.class);
    }
    
}
