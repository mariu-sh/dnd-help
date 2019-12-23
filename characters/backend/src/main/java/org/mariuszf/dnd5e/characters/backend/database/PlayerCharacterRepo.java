package org.mariuszf.dnd5e.characters.backend.database;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCharacterRepo extends JpaRepository<PlayerCharacter, Long> {

}
