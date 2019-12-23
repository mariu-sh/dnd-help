package org.mariuszf.dnd5e.characters.backend.domain.races;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;

import java.util.function.Function;

enum Race {
    DWARF(Race::addDwarfStats),
    ELF(Race::addElfStats),
    HALFLING(Race::addHalflingStats),
    HUMAN(Race::addHumanStats),
//  VARIANTHUMAN(Race::addVariantHumanStats), skills of choice
    DRAGONBORN(Race::addDragonbornStats),
    GNOME(Race::addGnomeStats),
//    HALFELF(Race::addHalfELFStats),, skills of choice
    HALFORC(Race::addHalfOrcStats),
    TIEFLING(Race::addTieflingStats);

    private final Function<PlayerCharacter, PlayerCharacter> statsUpdater;

    Race(Function<PlayerCharacter, PlayerCharacter> statsUpdater) {
        this.statsUpdater = statsUpdater;
    }

    public PlayerCharacter updateRacialStats(PlayerCharacter playerCharacter){
        return statsUpdater.apply(playerCharacter);
    }

    private static PlayerCharacter addDwarfStats(PlayerCharacter playerCharacter){
        playerCharacter.addConstitution(2);
        return playerCharacter;
    }

    private static PlayerCharacter addDragonbornStats(PlayerCharacter playerCharacter){
        playerCharacter.addStrength(2);
        playerCharacter.addCharisma(1);
        return playerCharacter;
    }

    private static PlayerCharacter addElfStats(PlayerCharacter playerCharacter){
        playerCharacter.addDexterity(2);
        return playerCharacter;
    }

    private static PlayerCharacter addGnomeStats(PlayerCharacter playerCharacter){
        playerCharacter.addIntelligence(2);
        return playerCharacter;
    }

    private static PlayerCharacter addHalflingStats(PlayerCharacter playerCharacter){
        playerCharacter.addDexterity(2);
        return playerCharacter;
    }

    private static PlayerCharacter addHalfOrcStats(PlayerCharacter playerCharacter){
        playerCharacter.addStrength(2);
        playerCharacter.addConstitution(1);
        return playerCharacter;
    }

    private static PlayerCharacter addHumanStats(PlayerCharacter playerCharacter){
        playerCharacter.addStrength(1);
        playerCharacter.addDexterity(1);
        playerCharacter.addConstitution(1);
        playerCharacter.addIntelligence(1);
        playerCharacter.addWisdom(1);
        playerCharacter.addCharisma(1);
        return playerCharacter;
    }

    private static PlayerCharacter addTieflingStats(PlayerCharacter playerCharacter){
        playerCharacter.addIntelligence(1);
        playerCharacter.addCharisma(2);
        return playerCharacter;
    }
}
