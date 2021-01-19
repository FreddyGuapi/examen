/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacha.session;

import com.cacha.entidades.Gestion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Freddy-PC
 */
@Local
public interface GestionFacadeLocal {

    void create(Gestion gestion);

    void edit(Gestion gestion);

    void remove(Gestion gestion);

    Gestion find(Object id);

    List<Gestion> findAll();

    List<Gestion> findRange(int[] range);

    int count();
    
}
