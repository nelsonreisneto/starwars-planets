package br.com.starwars.clients;

import br.com.starwars.domain.dtos.PlanetDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "starwarsapi", url = "https://swapi.dev/api/planets/")
public interface StarWarsApiClient {

    @GetMapping(value = "/{id}/")
    ResponseEntity<PlanetDto> getPlanet(@PathVariable("id") Integer id);
}
