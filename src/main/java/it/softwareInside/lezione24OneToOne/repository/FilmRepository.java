package it.softwareInside.lezione24OneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.lezione24OneToOne.models.Film;

public interface FilmRepository extends JpaRepository<Film, Integer>{

}
