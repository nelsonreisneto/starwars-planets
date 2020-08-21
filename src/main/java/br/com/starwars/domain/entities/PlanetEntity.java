package br.com.starwars.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "planets")
public class PlanetEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "climate", length = 150, nullable = false)
    private String climate;

    @Column(name = "terrain", length = 150, nullable = false)
    private String terrain;

    @Column(name = "films")
    private Integer films;

}
