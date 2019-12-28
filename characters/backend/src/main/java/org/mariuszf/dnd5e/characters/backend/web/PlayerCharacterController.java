package org.mariuszf.dnd5e.characters.backend.web;

import org.mariuszf.dnd5e.characters.backend.domain.races.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerCharacterController {

    private RaceService raceService;

    @Autowired
    public PlayerCharacterController(RaceService raceService) {
        this.raceService = raceService;
    }

//    @GetMapping("/races/{raceName}")
//    public RaceDTO getRaceByName(@PathVariable String raceName){
//        return raceService.getRaceByName(raceName);
//    }

    @GetMapping("/races/{raceName}/subraces")
    public List<SubRaceDTO> getSubRacesForRace(@PathVariable String raceName){
        return raceService.getSubRacesForRace(raceName);
    }

}
