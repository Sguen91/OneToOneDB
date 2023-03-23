package it.softwareInside.lezione24OneToOne.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.softwareInside.lezione24OneToOne.models.Film;
import it.softwareInside.lezione24OneToOne.repository.FilmRepository;

@Service
public class FilmService {

	@Autowired
	FilmRepository filmRepository;

	/**
	 * metodo per aggiungere un film nel database
	 * @param film
	 * @return
	 */
	public boolean addFilm(Film film) {

		try {
			filmRepository.save(film);
			return true;

		} catch (Exception e) {
			return false;
		}

	}
	/**
	 * metodo per stampare la lista dei film presenti nel database
	 * @return
	 */
	public List<Film> stampa() {

		return filmRepository.findAll();
	}
	/**
	 * metodo per cancellare un film nel database
	 * @param id
	 * @return
	 */
	public Film cancella(int id) {

		try {

			Film film = filmRepository.findById(id).get();
			filmRepository.deleteById(id);

			return film;
		} catch (Exception e) {
			return null;
		}

	}
	/**
	 * metodo per cancellare l'intero database
	 * @return
	 */
	public boolean deleteAll() {
		
		try {
			filmRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/**
	 * metodo per stampare un singolo film richiamando l'id.
	 * @param id
	 * @return
	 */
	public Film getFilm(int id) {
		try {
			
			Film film = filmRepository.findById(id).get();
			filmRepository.deleteById(id);
			
			return film;
			
		} catch (Exception e) {
			return null;
		}
	}
	
}
