package org.mariuszf.dnd5e.characters.backend.races.domain;

import org.mariuszf.dnd5e.characters.backend.races.web.RaceDTO;
import org.mariuszf.dnd5e.characters.backend.races.web.SubRaceDTO;
import org.mariuszf.dnd5e.characters.backend.races.web.exceptions.RaceDoesNotExistException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RaceService {

    public List<RaceDTO> getAllRaces() {
        return Arrays.asList(Race.values())
                .stream()
                .map(race -> race.toDto())
                .collect(Collectors.toList());
    }

    public RaceDTO getRaceByName(String raceName){
        return getRaceEnumByName(raceName).toDto();
    }

    public List<SubRaceDTO> getSubRacesForRace(String raceName){
        return getRaceEnumByName(raceName).getSubRaces()
                .stream()
                .map(SubRace::toDto)
                .collect(Collectors.toList());
    }

    private Race getRaceEnumByName(String raceName){
        try {
            return Race.valueOf(raceName.toUpperCase().replace("-", "_"));
        } catch (IllegalArgumentException iae) {
            throw new RaceDoesNotExistException();
        }
    }
}
