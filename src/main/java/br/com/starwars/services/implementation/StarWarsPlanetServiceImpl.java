package br.com.starwars.services.implementation;

import br.com.starwars.clients.StarWarsApiClient;
import br.com.starwars.domain.PlanetsEnum;
import br.com.starwars.domain.entities.PlanetEntity;
import br.com.starwars.domain.repositories.PlanetRepository;
import br.com.starwars.services.StarWarsPlanetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class StarWarsPlanetServiceImpl implements StarWarsPlanetService {

    private final StarWarsApiClient starWarsClient;
    private final PlanetRepository planetRepository;

    public StarWarsPlanetServiceImpl(StarWarsApiClient starWarsApiClient,
                                     PlanetRepository planetRepository) {
        this.starWarsClient = starWarsApiClient;
        this.planetRepository = planetRepository;
    }

    public PlanetEntity get(Long id) {
        log.info("Buscando dados por ID da tabela Planets.");
        return planetRepository.getFirstById(id);
    }

    public List<PlanetEntity> getAll() {
        log.info("Buscando todos os dados da tabela Planets.");
        return planetRepository.findAll();
    }

    public void insert(PlanetEntity planetEntity) {
        log.info("Inserindo dados de um planeta na tabela Planets.");
        planetRepository.saveAndFlush(planetEntity);
    }

    public void update(PlanetEntity planetEntity) {
        log.info("Alterando dados de um planeta na tabela Planets.");
        planetRepository.saveAndFlush(planetEntity);
    }

    public void delete(Long id) {
        log.info("Excluindo os dados por ID da tabela Planets.");
        planetRepository.deleteById(id);
    }

    public void deleteAll() {
        log.info("Excluindo todos os dados da tabela Planets.");
        planetRepository.deleteAll();
    }

    public Integer howManyTimesInMovies(String planetName) {
        Integer planetId = PlanetsEnum.of(planetName);
        if (planetId.equals(0)) {
            return planetId;
        }
        return Objects.requireNonNull(starWarsClient.getPlanet(planetId).getBody()).getFilms().size();
    }

}
