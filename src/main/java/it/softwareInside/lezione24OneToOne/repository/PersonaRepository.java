package it.softwareInside.lezione24OneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.lezione24OneToOne.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
