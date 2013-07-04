/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author jeff
 */
@Entity
@NamedQueries({
       @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
})
public class Cliente extends Pessoa implements Serializable {

       private static final long serialVersionUID = 1L;
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       public Cliente() {
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
              if (!(object instanceof Cliente)) {
                     return false;
              }
              Cliente other = (Cliente) object;
              if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
                     return false;
              }
              return true;
       }

       @Override
       public String toString() {
              return "model.Cliente[ id=" + id + " ]";
       }
}
