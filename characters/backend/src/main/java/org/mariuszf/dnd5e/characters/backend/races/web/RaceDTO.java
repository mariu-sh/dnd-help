package org.mariuszf.dnd5e.characters.backend.races.web;

import java.util.List;

public class RaceDTO {

    private String name;
    private List<SubRaceDTO> subRaces;

    public RaceDTO(String raceName, List<SubRaceDTO> subRaces) {
        this.name = raceName;
        this.subRaces = subRaces;
    }

    public String getName() {
        return name;
    }

    public List<SubRaceDTO> getSubRaces() {
        return subRaces;
    }
}
