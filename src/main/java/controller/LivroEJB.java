/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.ModelLivro;

/**
 *
 * @author jeff
 */
@Stateless
public class LivroEJB {

       @PersistenceContext
       EntityManager em;
       
       public void salvar( ModelLivro livro )
       {
              em.merge( livro );
       }

       
       
       public List < ModelLivro > findAll()
       {
              return em.createNamedQuery("ModelLivro.findAll").getResultList();
              
       }
       
       
       
       public void remove ( Long id )
       {
           ModelLivro modelLivro = em.find(ModelLivro.class, id);
           em.remove ( modelLivro ) ;
       }
       
}
