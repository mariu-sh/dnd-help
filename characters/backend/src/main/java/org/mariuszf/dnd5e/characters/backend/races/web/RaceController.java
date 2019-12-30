package org.mariuszf.dnd5e.characters.backend.races.web;

import org.mariuszf.dnd5e.characters.backend.races.domain.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/race")
public class RaceController {

    private RaceService raceService;

    @Autowired
    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

//    @GetMapping
//    public List<RaceDTO> getAllRaces(){
//        return raceService.getAllRaces();
//    }
}
