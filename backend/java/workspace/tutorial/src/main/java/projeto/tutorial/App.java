package projeto.tutorial;

import java.util.List;

import projeto.tutorial.dao.UsuarioDAO;
import projeto.tutorial.modelo.Usuario;

public class App {

	public static void main(String[] args) {
		UsuarioDAO d = new UsuarioDAO();
		
		List<Usuario> l = d.listar();
		
		for(Usuario u: l) {
			System.out.println("Nome: " + u.getNome() + "(" + u.getEmail() + ")");
		}
	}

}
