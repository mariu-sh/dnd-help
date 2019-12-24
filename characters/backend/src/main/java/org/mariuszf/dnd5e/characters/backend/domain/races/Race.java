package org.mariuszf.dnd5e.characters.backend.domain.races;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;

import java.util.List;
import java.util.function.Function;

public enum Race {
    DWARF(Race::addDwarfStats, SubRace.getDwarfSubRaces()),
    ELF(Race::addElfStats, SubRace.getElfSubRaces()),
    HALFLING(Race::addHalflingStats, SubRace.getHalflingSubRaces()),
    HUMAN(Race::addHumanStats, SubRace.getHumanSubRaces()),
//  VARIANTHUMAN(Race::addVariantHumanStats, SubRace.getHumanSubRaces()), skills of choice
//  DRAGONBORN(Race::addDragonbornStats), DragonAncestry ?? not a subrace??
    GNOME(Race::addGnomeStats, SubRace.getGnomeSubRaces()),
//    HALFELF(Race::addHalfELFStats, SubRace.getHalfElfSubRaces()), skills of choice
    HALFORC(Race::addHalfOrcStats, SubRace.getHalfOrcSubRaces()),
    TIEFLING(Race::addTieflingStats, SubRace.getTieflingSubRaces());

    private final Function<PlayerCharacter, PlayerCharacter> statsUpdater;
    private final List<SubRace> availableSubRaces;

    Race(Function<PlayerCharacter, PlayerCharacter> statsUpdater, List<SubRace> availableSubRaces) {
        this.statsUpdater = statsUpdater;
        this.availableSubRaces = availableSubRaces;
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
