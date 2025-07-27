package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import play.db.jpa.Model;

@Entity

public class Restaurante extends Model {
	
	public String nomeDoRestuarnte;
	public String CNPJ;
	public String categoria;
	
	@ManyToMany
	@JoinTable(name="cliente_restaurante")
	public List<Cliente> clientes;
	

}
