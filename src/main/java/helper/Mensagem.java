package helper;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author jeff
 */
public class Mensagem {

       public static void sucesso() 
       {
              mensagem(FacesMessage.SEVERITY_INFO, "Sucesso", "Operação realizada com sucesso!");
       }

       
       
       public static void erro( String mensagem ) 
       {
              mensagem(FacesMessage.SEVERITY_ERROR, "Erro", mensagem);
       }

       
       
       private static void mensagem( FacesMessage.Severity severity, String titulo, String mensagem ) 
       {
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( severity, titulo, mensagem ));
       }
}
