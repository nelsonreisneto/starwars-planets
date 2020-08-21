package br.com.starwars.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
public enum PlanetsEnum {

    TATOOINE(1, "Tatooine"),
    ALDERAAN(2, "Alderaan"),
    YAVIN_IV(3, "Yavin IV"),
    HOTH(4, "Hoth"),
    DAGOBAH(5, "Dagobah"),
    BESPIN(6, "Bespin"),
    ENDOR(7, "Endor"),
    NABOO(8, "Naboo"),
    CORUSCANT(9, "Coruscant"),
    KAMINO(10, "Kamino");

    @Getter
    private Integer id;
    @Getter
    private String name;

    public static Integer of(String name) {
        return Arrays.stream(PlanetsEnum.values())
                .filter(planetsEnum -> planetsEnum.getName().equalsIgnoreCase(name))
                .map(PlanetsEnum::getId)
                .findFirst()
                .orElse(0);
    }
}
