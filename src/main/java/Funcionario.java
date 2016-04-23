import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class Funcionario implements Serializable{

	private static final long serialVersionUID = -7360095586931514238L;
	
	private String nome;
	private String email;
	

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

	
	public void cadastrar(){
		System.out.println("Nome " + this.nome);
		System.out.println("Email " + this.email);
		inverter(nome);
	}
	
	public void inverter(String texto){
		System.out.println(this.nome.length());
	}
	
	
	
}
