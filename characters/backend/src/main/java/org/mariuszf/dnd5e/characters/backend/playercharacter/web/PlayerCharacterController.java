package org.mariuszf.dnd5e.characters.backend.playercharacter.web;

import org.mariuszf.dnd5e.characters.backend.playercharacter.domain.PlayerCharacter;
import org.mariuszf.dnd5e.characters.backend.playercharacter.domain.PlayerCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playercharacter")
public class PlayerCharacterController {

    private PlayerCharacterService playerCharacterService;

    @Autowired
    public PlayerCharacterController(PlayerCharacterService playerCharacterService) {
        this.playerCharacterService = playerCharacterService;
    }

    @GetMapping
    public List<PlayerCharacterDTO> getAllPlayerCharacters(){
        return playerCharacterService.getAllPlayerCharacters()
                .stream()
                .map(PlayerCharacterController::toDto)
                .collect(Collectors.toList());
    }

    private static PlayerCharacterDTO toDto(PlayerCharacter playerCharacter){
        return new PlayerCharacterDTO(playerCharacter.getId(),
                playerCharacter.getName(),
                playerCharacter.getStrength(),
                playerCharacter.getDexterity(),
                playerCharacter.getConstitution(),
                playerCharacter.getIntelligence(),
                playerCharacter.getWisdom(),
                playerCharacter.getCharisma());
    }
}
