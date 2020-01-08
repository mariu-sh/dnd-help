package org.mariuszf.dnd5e.characters.backend.playercharacter.domain;

import org.mariuszf.dnd5e.characters.backend.races.domain.Race;
import org.mariuszf.dnd5e.characters.backend.races.domain.SubRace;

import javax.persistence.*;

@Entity
@Table(name = "playercharacters")
public class PlayerCharacter {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Race race;
    @Column
    private SubRace subRace;

    @Embedded
    private Abilities abilities;

    public PlayerCharacter(){
        this.abilities = new Abilities();
    }

    public void addStrength(Integer strength) {
        this.strength += strength;
    }

    public void addDexterity(Integer dexterity) {
        this.dexterity += dexterity;
    }

    public void addConstitution(Integer constitution) {
        this.constitution += constitution;
    }

    public void addIntelligence(Integer intelligence) {
        this.intelligence += intelligence;
    }

    public void addWisdom(Integer wisdom) {
        this.wisdom += wisdom;
    }

    public void addCharisma(Integer charisma) {
        this.charisma += charisma;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setStrength(Integer strength){ this.abilities.setStrength(strength); }
    public void setDexterity(Integer dexterity){ this.abilities.setDexterity(dexterity); }
    public void setConstitution(Integer constitution){ this.abilities.setConstitution(constitution); }
    public void setIntelligence(Integer intelligence){ this.abilities.setIntelligence(intelligence); }
    public void setWisdom(Integer wisdom){ this.abilities.setWisdom(wisdom); }
    public void setCharisma(Integer charisma){ this.abilities.setCharisma(charisma); }

    public Integer getStrength() { return this.abilities.getStrength(); }
    public Integer getDexterity() { return this.abilities.getDexterity(); }
    public Integer getConstitution() { return this.abilities.getConstitution(); }
    public Integer getIntelligence() { return this.abilities.getIntelligence(); }
    public Integer getWisdom() { return this.abilities.getWisdom(); }
    public Integer getCharisma() { return this.abilities.getCharisma(); }
}
