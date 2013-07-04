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
import model.Cliente;
import model.Emprestimo;
import model.ModelLivro;

/**
 *
 * @author jeff
 */
@ManagedBean
@ViewScoped
public class EmprestimoMB {

       private Emprestimo emprestimo = new Emprestimo();
       private Cliente cliente = new Cliente();
       private ModelLivro modelLivro = new ModelLivro();
       private Emprestimo emprestimoSelecionado = new Emprestimo();
       @EJB
       EmprestimoEJB emprestimoEJB;

       public EmprestimoMB() {
       }

       public Emprestimo getEmprestimoSelecionado() {
              return emprestimoSelecionado;
       }

       public void setEmprestimoSelecionado(Emprestimo emprestimoSelecionado) {
              this.emprestimoSelecionado = emprestimoSelecionado;
       }

       public ModelLivro getModelLivro() {
              return modelLivro;
       }

       public void setModelLivro(ModelLivro modelLivro) {
              this.modelLivro = modelLivro;
       }

       public void devolver() {
              emprestimoEJB.devolver(emprestimoSelecionado);
       }

       public Cliente getCliente() {
              return cliente;
       }

       public void setCliente(Cliente cliente) {
              this.cliente = cliente;
       }

       public Emprestimo getEmprestimo() {
              return emprestimo;
       }

       public void setEmprestimo(Emprestimo emprestimo) {
              this.emprestimo = emprestimo;
       }

       public void salvar() {
              emprestimo.setCliente(cliente);
              emprestimo.setLivro(modelLivro);
              emprestimoEJB.salvar(emprestimo);
              setEmprestimo(new Emprestimo());
       }

       public List<Emprestimo> findAll() {
              return emprestimoEJB.findAll();
       }
}
