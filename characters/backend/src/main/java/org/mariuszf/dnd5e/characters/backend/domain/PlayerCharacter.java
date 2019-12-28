package org.mariuszf.dnd5e.characters.backend.domain;

import org.mariuszf.dnd5e.characters.backend.domain.races.Race;
import org.mariuszf.dnd5e.characters.backend.domain.races.SubRace;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    @Column(nullable = false)
    private Integer strength;
    @Column(nullable = false)
    private Integer dexterity;
    @Column(nullable = false)
    private Integer constitution;
    @Column(nullable = false)
    private Integer intelligence;
    @Column(nullable = false)
    private Integer wisdom;
    @Column(nullable = false)
    private Integer charisma;

    public PlayerCharacter(){
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

    public Integer getStrength() {
        return strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public Integer getCharisma() {
        return charisma;
    }
}
