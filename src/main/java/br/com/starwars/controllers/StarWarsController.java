package br.com.starwars.controllers;

import br.com.starwars.domain.entities.PlanetEntity;
import br.com.starwars.services.implementation.StarWarsPlanetServiceImpl;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.inject.Named;
import java.util.List;

@Named("starwars")
@Controller
@NoArgsConstructor
public class StarWarsController {

    private StarWarsPlanetServiceImpl starWarsPlanetService;
    @Getter
    @Setter
    PlanetEntity planet = new PlanetEntity();

    @Autowired
    public StarWarsController(StarWarsPlanetServiceImpl starWarsPlanetService) {
        this.starWarsPlanetService = starWarsPlanetService;
    }

    public List<PlanetEntity> getAllPlanets() {
        return starWarsPlanetService.getAll();
    }

    public void deletePlanet(Long id) {
        starWarsPlanetService.delete(id);
    }

    public void deleteAll() {
        starWarsPlanetService.deleteAll();
    }

    public String updatePlanet(PlanetEntity planetEntity) {
        Integer films = starWarsPlanetService.howManyTimesInMovies(planetEntity.getName());
        planetEntity.setFilms(films);
        starWarsPlanetService.update(planetEntity);
        return "planetList.xhtml";
    }

    public String insertPlanet(PlanetEntity planetEntity) {
        Integer films = starWarsPlanetService.howManyTimesInMovies(planetEntity.getName());
        planetEntity.setFilms(films);
        starWarsPlanetService.insert(planetEntity);
        return "planetList.xhtml";
    }

    public String toAdd() {
        return "newPlanet.xhtml";
    }

}

