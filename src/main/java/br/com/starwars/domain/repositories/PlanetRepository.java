package br.com.starwars.domain.repositories;

import br.com.starwars.domain.entities.PlanetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetRepository extends JpaRepository<PlanetEntity, Long> {

    PlanetEntity getFirstById(Long id);

    void deleteById(Long id);
}
