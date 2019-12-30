package org.mariuszf.dnd5e.characters.backend.playercharacter.domain;

import org.mariuszf.dnd5e.characters.backend.playercharacter.database.PlayerCharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerCharacterService {

    private PlayerCharacterRepo playerCharacterRepo;

    @Autowired
    public PlayerCharacterService(PlayerCharacterRepo playerCharacterRepo) {
        this.playerCharacterRepo = playerCharacterRepo;
    }

//    public PlayerCharacterDTO createNewCharacter(){
//
//    }

}