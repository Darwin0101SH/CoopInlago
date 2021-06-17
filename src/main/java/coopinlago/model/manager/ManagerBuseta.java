/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coopinlago.model.manager;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import coopinlago.model.entities.Busetas;

/**
 *
 * @author Darwin
 */
@Stateless
public class ManagerBuseta {

    @PersistenceContext
    private EntityManager em;

    public List<Busetas> findAllViajes() {
        return em.createNamedQuery("Busetas.findAll", Busetas.class).
                getResultList();
    }
}
