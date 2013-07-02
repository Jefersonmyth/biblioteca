package view;

import controller.ClienteEJB;
import helper.Mensagem;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Cliente;

/**
 *
 * @author jeff
 */
@ManagedBean
@ViewScoped
public class clienteMB {

       private Cliente cliente;
       @EJB
       private ClienteEJB clienteEJB;

       
       
       public ClienteEJB getClienteEJB() {
              return clienteEJB;
       }

       
       
       public void setClienteEJB(ClienteEJB clienteEJB) {
              this.clienteEJB = clienteEJB;
       }

       
       
       @PostConstruct
       public void inicializar() {
              cliente = new Cliente();
       }

       
       
       public clienteMB()
       {
       }

       
       
       public Cliente getCliente() {
              return cliente;
       }

       
       
       public void setCliente( Cliente cliente ) 
       {
              this.cliente = cliente;
       }

       
       
       public void salvar() 
       {
              clienteEJB.salvar( cliente );
              setCliente(new Cliente());
              Mensagem.sucesso();
       }
       
       
       
       public List < Cliente > findAll()
       {
              return clienteEJB.findAll();
       }
       
       
       
       public void remove(Long id)
       {
              clienteEJB.remove(id);
              Mensagem.sucesso();  
       }
       
       
       
       public void editar(Cliente cliente)
       {
              setCliente(cliente);
       }
}//Fim Classe
