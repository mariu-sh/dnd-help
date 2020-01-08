package org.mariuszf.dnd5e.characters.backend.database;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCharacterRepo extends JpaRepository<PlayerCharacterEntity, Long> {

    default PlayerCharacter createNewCharacter(){
        return toDomain(save(new PlayerCharacterEntity()));
    }

    private static PlayerCharacter toDomain(PlayerCharacterEntity playerCharacterEntity){
        return new PlayerCharacter(playerCharacterEntity.getId());
    }

    private static PlayerCharacterEntity toEntity(PlayerCharacter playerCharacter){
        return null;
    }
}
