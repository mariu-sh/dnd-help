package org.mariuszf.dnd5e.characters.backend.domain.races;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;

import java.util.function.Function;

public enum SubRace {

    HILLDWARF(SubRace::addHillDwarfStats),
    MOUNTAINDWARF(SubRace::addMountainDwarfStats),
    HIGHELF(SubRace::addHighElfStats),
    WOODELF(SubRace::addWoodElfStats),
    DROW(SubRace::addDrowStats),
    LIGHTFOOT(SubRace::addLightFootStats),
    STOUT(SubRace::addStoutStats),
    FORESTGNOME(SubRace::addForestGnomeStats),
    ROCKGNOME(SubRace::addRockGnomeStats);

    private final String subRaceName;
    private final Function<PlayerCharacter, PlayerCharacter> statsUpdater;

    SubRace(Function<PlayerCharacter, PlayerCharacter> statsUpdater) {
        this.subRaceName = this.name().toLowerCase();
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

    private static PlayerCharacter addHighElfStats(PlayerCharacter playerCharacter){
        playerCharacter.addIntelligence(1);
        return playerCharacter;
    }

    private static PlayerCharacter addWoodElfStats(PlayerCharacter playerCharacter){
        playerCharacter.addWisdom(1);
        return playerCharacter;
    }

    private static PlayerCharacter addDrowStats(PlayerCharacter playerCharacter){
        playerCharacter.addCharisma(1);
        return playerCharacter;
    }

    private static PlayerCharacter addLightFootStats(PlayerCharacter playerCharacter){
        playerCharacter.addCharisma(1);
        return playerCharacter;
    }

    private static PlayerCharacter addStoutStats(PlayerCharacter playerCharacter){
        playerCharacter.addConstitution(1);
        return playerCharacter;
    }

    private static PlayerCharacter addForestGnomeStats(PlayerCharacter playerCharacter){
        playerCharacter.addDexterity(1);
        return playerCharacter;
    }

    private static PlayerCharacter addRockGnomeStats(PlayerCharacter playerCharacter){
        playerCharacter.addConstitution(1);
        return playerCharacter;
    }

    public String getSubRaceName() {
        return subRaceName;
    }
}
