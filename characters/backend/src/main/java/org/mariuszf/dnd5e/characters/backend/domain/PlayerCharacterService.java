package org.mariuszf.dnd5e.characters.backend.domain;

import org.mariuszf.dnd5e.characters.backend.database.PlayerCharacterRepo;
import org.mariuszf.dnd5e.characters.backend.web.PlayerCharacterCreateDTO;
import org.mariuszf.dnd5e.characters.backend.web.PlayerCharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerCharacterService {

    private PlayerCharacterRepo playerCharacterRepo;

    @Autowired
    public PlayerCharacterService(PlayerCharacterRepo playerCharacterRepo) {
        this.playerCharacterRepo = playerCharacterRepo;
    }

    public PlayerCharacterDTO createNewCharacter(PlayerCharacterCreateDTO playerCharacterCreateDTO){

    }

}
