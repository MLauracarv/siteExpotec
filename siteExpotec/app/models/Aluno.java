package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Aluno extends Model {
	
	public String nome;
	public String email;
	public String senha;
	public int anoNascimento;

}
