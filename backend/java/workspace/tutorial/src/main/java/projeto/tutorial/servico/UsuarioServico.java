package projeto.tutorial.servico;

import java.util.List;

import projeto.tutorial.dao.UsuarioDAO;
import projeto.tutorial.modelo.Usuario;

public class UsuarioServico {
	public List<Usuario> listarUsuarios(){
    	UsuarioDAO dao = new UsuarioDAO();
    	List<Usuario> lista = dao.listar();
    	
    	return lista;
	}
}
