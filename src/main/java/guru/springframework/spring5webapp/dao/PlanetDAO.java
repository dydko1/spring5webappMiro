package guru.springframework.spring5webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.spring5webapp.model.Planet;

public interface PlanetDAO extends JpaRepository<Planet, Long> {
	Planet findByname(String name);

}
