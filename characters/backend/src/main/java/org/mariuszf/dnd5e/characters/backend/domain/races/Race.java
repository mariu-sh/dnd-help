package org.mariuszf.dnd5e.characters.backend.domain.races;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;

import java.util.List;
import java.util.function.Function;

public enum Race {
    DWARF(Race::addDwarfStats, List.of(SubRace.HILL_DWARF, SubRace.MOUNTAIN_DWARF)),
    ELF(Race::addElfStats, List.of(SubRace.HIGH_ELF, SubRace.WOOD_ELF, SubRace.DROW)),
    HALFLING(Race::addHalflingStats, List.of(SubRace.LIGHTFOOT, SubRace.STOUT)),
    HUMAN(Race::addHumanStats, List.of()),
//    VARIANTHUMAN(Race::addVariantHumanStats), //skills of choice
    DRAGONBORN(Race::addDragonbornStats, List.of()), //DragonAncestry ?? not a subrace??
    GNOME(Race::addGnomeStats, List.of(SubRace.FOREST_GNOME, SubRace.ROCK_GNOME)),
//    HALFELF(Race::addHalfELFStats), //skills of choice
    HALF_ORC(Race::addHalfOrcStats, List.of()),
    TIEFLING(Race::addTieflingStats, List.of());

    private final String raceName;
    private final List<SubRace> subRaces;
    private final Function<PlayerCharacter, PlayerCharacter> statsUpdater;

    Race(Function<PlayerCharacter, PlayerCharacter> statsUpdater, List<SubRace> subRaces) {
        this.raceName = this.name().toLowerCase();
        this.subRaces = subRaces;
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

    public String getRaceName() {
        return raceName;
    }

    public List<SubRace> getSubRaces() {
        return subRaces;
    }
}
