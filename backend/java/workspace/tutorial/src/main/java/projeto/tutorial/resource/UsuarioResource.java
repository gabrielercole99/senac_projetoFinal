package projeto.tutorial.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import projeto.tutorial.dao.UsuarioDAO;
import projeto.tutorial.modelo.Usuario;

@Path("appTutorial")
public class UsuarioResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listar")
    public Response getUsuarios() {
    	UsuarioDAO dao = new UsuarioDAO();
    	List<Usuario> lista = dao.listar();
    	
    	Response response = Response.ok().entity(lista).build();
    	
    	return response;
    }
}
