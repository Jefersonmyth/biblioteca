/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Emprestimo;

/**
 *
 * @author jeff
 */
@Stateless
public class EmprestimoEJB {

       @PersistenceContext
       EntityManager em;
       
       public void salvar(Emprestimo emprestimo)
       {
              em.merge(emprestimo);
       }
       
       
       public List <Emprestimo> findAll()
       {
              return em.createNamedQuery("emprestimo.findAll").getResultList();
       }

       
       public void devolver( Emprestimo emprestimo)
       {
              Emprestimo e = em.find(Emprestimo.class, emprestimo.getId());
              e.setControlaEmprestimo(true);
              em.merge(e);
       }
}
