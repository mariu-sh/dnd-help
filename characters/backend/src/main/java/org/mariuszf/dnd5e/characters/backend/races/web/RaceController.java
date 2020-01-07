package org.mariuszf.dnd5e.characters.backend.races.web;

import org.mariuszf.dnd5e.characters.backend.races.domain.Race;
import org.mariuszf.dnd5e.characters.backend.races.domain.RaceService;
import org.mariuszf.dnd5e.characters.backend.races.domain.SubRace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/race")
public class RaceController {

    private RaceService raceService;

    @Autowired
    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping
    public List<RaceDTO> getAllRaces(){
        return raceService.getAllRaces()
                .stream()
                .map(RaceController::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{raceName}")
    public RaceDTO getRaceByName(@PathVariable String raceName){
        return toDTO(raceService.getRaceByName(raceName));
    }

    private static RaceDTO toDTO(Race race){
        return new RaceDTO(race.name().toLowerCase().replace("_","-"),
                race.getSubRaces().stream()
                        .map(RaceController::toDTO)
                        .collect(Collectors.toList())
        );
    }

    private static SubRaceDTO toDTO(SubRace subRace){
        return new SubRaceDTO(subRace.name().toLowerCase().replace("_","-"));
    }
}
