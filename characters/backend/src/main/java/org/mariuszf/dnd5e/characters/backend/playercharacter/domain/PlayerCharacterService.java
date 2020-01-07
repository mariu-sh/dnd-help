package org.mariuszf.dnd5e.characters.backend.playercharacter.domain;

import org.mariuszf.dnd5e.characters.backend.playercharacter.database.PlayerCharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerCharacterService {

    private PlayerCharacterRepo playerCharacterRepo;

    @Autowired
    public PlayerCharacterService(PlayerCharacterRepo playerCharacterRepo) {
        this.playerCharacterRepo = playerCharacterRepo;
    }

    public PlayerCharacter createNewCharacter(){
        return playerCharacterRepo.save(new PlayerCharacter());
    }

    public List<PlayerCharacter> getAllPlayerCharacters() {
        return playerCharacterRepo.findAll();
    }
}
