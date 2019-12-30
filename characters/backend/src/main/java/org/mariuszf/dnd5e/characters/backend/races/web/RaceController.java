package org.mariuszf.dnd5e.characters.backend.races.web;

import org.mariuszf.dnd5e.characters.backend.races.domain.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        return raceService.getAllRaces();
    }

    @GetMapping("/{raceName}")
    public RaceDTO getRaceByName(@PathVariable String raceName){
        return raceService.getRaceByName(raceName);
    }
}
