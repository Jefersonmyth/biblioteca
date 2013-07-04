/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LivroEJB;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Livro;

/**
 *
 * @author jeff
 */
@ManagedBean
@ViewScoped
public class livroMB {

       private Livro livro = new Livro();
       @EJB
       LivroEJB livroEJB;


       
   

       public Livro getLivro() {
              return livro;
       }

       public void setLivro(Livro livro) {
              this.livro = livro;
       }

       public livroMB() {
       }

       public void salvar() 
       {
              livroEJB.salvar(livro);
              setLivro(new Livro());
       }

       public List< Livro> findAll() {
              return livroEJB.findAll();
       }
}
