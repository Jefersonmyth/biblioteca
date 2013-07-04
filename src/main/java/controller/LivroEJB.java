/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Livro;

/**
 *
 * @author jeff
 */
@Stateless
public class LivroEJB {

       @PersistenceContext
       EntityManager em;
       
       public void salvar( Livro livro )
       {
              em.merge( livro );
       }

       
       
       public List < Livro > findAll()
       {
              return em.createNamedQuery("livros.findAll").getResultList();
              
       }
       
}
