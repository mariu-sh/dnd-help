package org.mariuszf.dnd5e.characters.backend.playercharacter.database;

import org.mariuszf.dnd5e.characters.backend.playercharacter.domain.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCharacterRepo extends JpaRepository<PlayerCharacter, Long> {

}
