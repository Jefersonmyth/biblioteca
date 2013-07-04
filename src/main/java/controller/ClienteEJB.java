package controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Cliente;

/**
 *
 * @author jeff
 */
@Stateless
public class ClienteEJB {

       @PersistenceContext
       EntityManager em;

       public void salvar(Cliente cliente) 
       {
              em.merge(cliente);
       }

       public List < Cliente > findAll() 
       {
              return em.createQuery("SELECT c FROM Cliente c").getResultList();
       }
       
       public void remove(Long id)
{
              Cliente cliente = em.find( Cliente.class, id );
              em.remove( cliente );
       }
       
       public List< Cliente > obterPorNome(String nome){
           Query query = em.createQuery("SELECT o FROM Pessoa o WHERE o.nome LIKE '%" + nome + "%'");
           return query.getResultList();
       }
}
