/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jeff
 */
@Entity
@NamedQueries({
       @NamedQuery(name = "emprestimo.findAll", query = "SELECT e FROM Emprestimo e")
})
public class Emprestimo implements Serializable {

       private static final long serialVersionUID = 1L;
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private Long id;
       @Temporal(TemporalType.DATE)
       private Date dataLocacao;
       @Temporal(TemporalType.DATE)
       private Date dataDevolucao;
       private boolean controlaEmprestimo = false;
       @ManyToOne
       private Cliente cliente;
       @ManyToOne
       private ModelLivro livro;

       public boolean isControlaEmprestimo() {
              return controlaEmprestimo;
       }

       public void setControlaEmprestimo(boolean controlaEmprestimo) {
              this.controlaEmprestimo = controlaEmprestimo;
       }

       public Date getDataLocacao() {
              return dataLocacao;
       }

       public void setDataLocacao(Date dataLocacao) {
              this.dataLocacao = dataLocacao;
       }

       public Date getDataDevolucao() {
              return dataDevolucao;
       }

       public void setDataDevolucao(Date dataDevolucao) {
              this.dataDevolucao = dataDevolucao;
       }

       public Cliente getCliente() {
              return cliente;
       }

       public void setCliente(Cliente cliente) {
              this.cliente = cliente;
       }

       public ModelLivro getLivro() {
              return livro;
       }

       public void setLivro(ModelLivro livro) {
              this.livro = livro;
       }

       public Long getId() {
              return id;
       }

       public void setId(Long id) {
              this.id = id;
       }

       @Override
       public int hashCode() {
              int hash = 0;
              hash += (id != null ? id.hashCode() : 0);
              return hash;
       }

       @Override
       public boolean equals(Object object) {
              // TODO: Warning - this method won't work in the case the id fields are not set
              if (!(object instanceof Emprestimo)) {
                     return false;
              }
              Emprestimo other = (Emprestimo) object;
              if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
                     return false;
              }
              return true;
       }

       @Override
       public String toString() {
              return "model.Emprestimo[ id=" + id + " ]";
       }
}
