package org.mariuszf.dnd5e.characters.backend.domain.races;

import org.mariuszf.dnd5e.characters.backend.domain.PlayerCharacter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

    public static List<SubRace> getDwarfSubRaces(){
        return Arrays.asList(HILLDWARF, MOUNTAINDWARF);
    }

    public static List<SubRace> getElfSubRaces() {
        return Arrays.asList(HIGHELF, WOODELF, DROW);
    }

    public static List<SubRace> getHalflingSubRaces(){
        return Arrays.asList(LIGHTFOOT, STOUT);
    }

    public static List<SubRace> getHumanSubRaces(){
        return Collections.emptyList();
    }

    public static List<SubRace> getHalfElfSubRaces() {
        return Collections.emptyList();
    }

    public static List<SubRace> getHalfOrcSubRaces() {
        return Collections.emptyList();
    }

    public static List<SubRace> getGnomeSubRaces(){
        return Arrays.asList(FORESTGNOME, ROCKGNOME);
    }

    public static List<SubRace> getTieflingSubRaces() {
        return Collections.emptyList();
    }
}
