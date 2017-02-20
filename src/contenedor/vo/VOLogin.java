package contenedor.vo;

import java.io.Serializable;

public class VOLogin implements Serializable {
	public String user;
	public String pass;
	public int edad;
	public String direccion;
	public String email;
	
	public VOLogin(String user, String pass, int edad, String direccion, String email) {
		super();
		this.user = user;
		this.pass = pass;
		this.edad = edad;
		this.direccion = direccion;
		this.email = email;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
