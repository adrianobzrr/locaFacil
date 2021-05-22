package Models;
/**
 
 * @author Yasmim
 */
public class Administrador extends Pessoa{

    
        private int id;
	private String senha;
	
	
	public Administrador(int id,  String senha) {
		this.id = id;
		this.senha = senha;
	
	}
	
	public Administrador( String senha) {
		this.senha = senha;
	}

	public Administrador(int id) {
		this.id = id;
	}
	
	public int getId_admin() {
		return id;
	}

	public void setId_admin(int id) {
		this.id = id;


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	@Override
	public String toString() {
		return "Administrador [id_adm=" + id+ ", cpf=" + cpf + ", senha=" + senha + ", nome=" + nome
				+ ", email=" + email + "]";
	}
}

    
}

    
}
