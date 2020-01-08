package org.mariuszf.dnd5e.characters.backend.web;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playercharacter")
public class PlayerCharacterController {

    private PlayerCharacterService playerCharacterService;

    @Autowired
    public PlayerCharacterController(PlayerCharacterService playerCharacterService) {
        this.playerCharacterService = playerCharacterService;
    }
    
}
