/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LivroEJB;
import helper.Mensagem;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.ModelLivro;

/**
 *
 * @author jeff
 */
@ManagedBean
@ViewScoped
public class livroMB {

       private ModelLivro livro = new ModelLivro();
       @EJB
       LivroEJB livroEJB;


       	private List<ModelLivro> listaTemp;

        public List<ModelLivro> getListaTemp() {
            return listaTemp;
        }

        public void setListaTemp(List<ModelLivro> listaTemp) {
            this.listaTemp = listaTemp;
        }
   

       public ModelLivro getLivro() {
              return livro;
       }

       public void setLivro(ModelLivro livro) {
              this.livro = livro;
       }

       public livroMB() {
       }

       public void salvar() 
       {
              livroEJB.salvar(livro);
              setLivro(new ModelLivro());
       }

       public List< ModelLivro > findAll() {
              return livroEJB.findAll();
       }
       
       public void editar ( ModelLivro modelLivro )
       {
           setLivro(modelLivro);
       }
       
       
       public void remove ( Long id )
       {
           livroEJB.remove(id);
           Mensagem.sucesso();
       }
       
}
