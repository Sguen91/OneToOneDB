package it.softwareInside.lezione24OneToOne.personaRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import it.softwareInside.lezione24OneToOne.models.Film;
import it.softwareInside.lezione24OneToOne.service.FilmService;


@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@Autowired
	FilmService filmService;
	
	
	@PostMapping("/add")
	public boolean addFilm(@RequestBody Film film) {
		
		System.out.println(film);
		
		return filmService.addFilm(film);
	}
	
	
	@GetMapping("/all")
	public List<Film> all() {
		
		return filmService.stampa();
	}
	
	
	//@PathParam("id") int id
	
	@DeleteMapping("/cancella")
	public Film cancella(@RequestParam("id") int id) {
		
		
		return filmService.cancella(id);
	}
	
	@DeleteMapping("/deleteAll")
	public boolean deleteAll() {
		return filmService.deleteAll();
	}
	
	@GetMapping("/getFilm")
	public Film getFilm(@RequestParam("id")int id) {
		return filmService.getFilm(id);
	}
	
	
}
