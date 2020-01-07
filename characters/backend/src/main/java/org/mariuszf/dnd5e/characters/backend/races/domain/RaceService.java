package org.mariuszf.dnd5e.characters.backend.races.domain;

import org.mariuszf.dnd5e.characters.backend.races.web.exceptions.RaceDoesNotExistException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RaceService {

    public List<Race> getAllRaces() {
        return Arrays.asList(Race.values());
    }

    public Race getRaceByName(String raceName){
        return getRaceEnumByName(raceName);
    }

    public List<SubRace> getSubRacesForRaceByName(String raceName){
        return getRaceEnumByName(raceName).getSubRaces();
    }

    private Race getRaceEnumByName(String raceName){
        try {
            return Race.valueOf(raceName.toUpperCase().replace("-", "_"));
        } catch (IllegalArgumentException iae) {
            throw new RaceDoesNotExistException();
        }
    }
}
