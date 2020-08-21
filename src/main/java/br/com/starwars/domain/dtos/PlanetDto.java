package br.com.starwars.domain.dtos;

import br.com.starwars.domain.entities.PlanetEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlanetDto {
    private static final long serialVersionUID = 1L;

    private String name;
    private String climate;
    private String terrain;
    private List<String> films;

    public PlanetEntity toEntity() {
        return PlanetEntity.builder()
                .name(this.getName())
                .climate(this.getClimate())
                .terrain(this.getTerrain())
                .build();
    }

}
