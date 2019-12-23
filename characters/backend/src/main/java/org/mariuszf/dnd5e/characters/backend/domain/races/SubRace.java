package org.mariuszf.dnd5e.characters.backend.domain.races;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;

import java.util.function.Function;

public enum SubRace {

    HILLDWARF(SubRace::addHillDwarfStats),
    MOUNTAINDWARF(SubRace::addMountainDwarfStats);

    private final Function<PlayerCharacter, PlayerCharacter> statsUpdater;

    SubRace(Function<PlayerCharacter, PlayerCharacter> statsUpdater) {
        this.statsUpdater = statsUpdater;
    }

    public PlayerCharacter updateSubRacialStats(PlayerCharacter playerCharacter){
        return statsUpdater.apply(playerCharacter);
    }
    
    private static PlayerCharacter addHillDwarfStats(PlayerCharacter playerCharacter){
        playerCharacter.addWisdom(1);
        return playerCharacter;
    }

    private static PlayerCharacter addMountainDwarfStats(PlayerCharacter playerCharacter){
        playerCharacter.addStrength(2);
        return playerCharacter;
    }

}
