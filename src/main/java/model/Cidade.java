
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Cidade implements Serializable {

       private static final long serialVersionUID = 1L;
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private String descricao;
       @ManyToOne
       private Estado estado = new Estado();
       
       public Cidade() {
              
       }

       public Estado getEstado() {
              return estado;
       }

       public void setEstado(Estado estado) {
              this.estado = estado;
       }

       public String getDescricao() {
              return descricao;
       }

       public void setDescricao(String descricao) {
              this.descricao = descricao;
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
              if (!(object instanceof Cidade)) {
                     return false;
              }
              Cidade other = (Cidade) object;
              if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
                     return false;
              }
              return true;
       }

       @Override
       public String toString() {
              return "model.Cidade[ id=" + id + " ]";
       }
}
