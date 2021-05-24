package Models;
/**
 * @author Yasmim
 */
public class Pessoa {
    
     
	protected String cpf;
	protected String nome;
	protected String email;
	
       
        public Pessoa( String cpf, String nome, String email) {
                this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
        public Pessoa( String cpf, String email) {
                this.cpf = cpf;
		this.email = email;
	}
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    @Override
    public String toString() {
		return " Nome: "+nome+", CPF: "+cpf+", Email: "+email;
	}

}
