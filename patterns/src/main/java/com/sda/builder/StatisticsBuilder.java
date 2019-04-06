package com.sda.builder;

public class StatisticsBuilder {
    private int strength;
    private int weaponsSkill;
    private int ballisticsSkill;
    private int toughness;
    private int agility;
    private int intelligence;
    private int willPower;
    private int fellowship;
    private int attacks;
    private int strenghtBonus;
    private int toughnessBonus;

    StatisticsBuilder() {

    }

    public StatisticsBuilder setStrength(int strength) {
        this.strength = strength;
        this.strenghtBonus = strength / 10;
        return this;
    }

    public StatisticsBuilder setWeaponsSkill(int weaponsSkill) {
        this.weaponsSkill = weaponsSkill;
        return this;
    }

    public StatisticsBuilder setBallisticsSkill(int ballisticsSkill) {
        this.ballisticsSkill = ballisticsSkill;
        return this;
    }

    public StatisticsBuilder setToughness(int toughness) {
        this.toughness = toughness;
        this.toughnessBonus = toughness / 12;
        return this;
    }

    public StatisticsBuilder setAgility(int agility) {
        this.agility = agility;
        return this;
    }

    public StatisticsBuilder setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public StatisticsBuilder setWillPower(int willPower) {
        this.willPower = willPower;
        return this;
    }

    public StatisticsBuilder setFellowship(int fellowship) {
        this.fellowship = fellowship;
        return this;
    }

    public StatisticsBuilder setAttacks(int attacks) {
        this.attacks = attacks;
        return this;
    }

    public Statistics createStatistics() {
        return new Statistics(strength, weaponsSkill, ballisticsSkill, toughness, agility, intelligence, willPower, fellowship, attacks, strenghtBonus, toughnessBonus);
    }
}