package it.softwareInside.lezione24OneToOne.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	private String nome;

	
	private String cognome;

	
	private int eta;

	public Persona( String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;

	}
}
