package it.softwareInside.lezione24OneToOne.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Film {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String titoloFilm;
	
	
	private String annoFilm;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	public Film(String annoFilm, String titoloFilm, Persona persona) {
		setAnnoFilm(annoFilm);
		setTitoloFilm(titoloFilm);
		setPersona(persona);
	}
}
