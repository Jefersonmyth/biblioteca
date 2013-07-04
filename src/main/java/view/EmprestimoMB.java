/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EmprestimoEJB;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Emprestimo;

/**
 *
 * @author jeff
 */
@ManagedBean
@ViewScoped
public class EmprestimoMB {

       private Emprestimo emprestimo = new Emprestimo();
       @EJB
       EmprestimoEJB emprestimoEJB;

       public EmprestimoMB() {
       }

       public Emprestimo getEmprestimo() {
              return emprestimo;
       }

       public void setEmprestimo(Emprestimo emprestimo) {
              this.emprestimo = emprestimo;
       }

       public void salvar() {
              emprestimoEJB.salvar(emprestimo);
              setEmprestimo(new Emprestimo());
       }

       public List<Emprestimo> findAll() {
              return emprestimoEJB.findAll();
       }
}
