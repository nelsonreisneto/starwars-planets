package br.com.starwars.services;

import br.com.starwars.domain.entities.PlanetEntity;

import java.util.List;

public interface StarWarsPlanetService {

    PlanetEntity get(Long id);

    List<PlanetEntity> getAll();

    void insert(PlanetEntity planetEntity);

    void update(PlanetEntity planetEntity);

    void delete(Long id);

    void deleteAll();

    public Integer howManyTimesInMovies(String planetName);
}
