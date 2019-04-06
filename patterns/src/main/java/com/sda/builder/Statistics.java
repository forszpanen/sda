package com.sda.builder;

public final class Statistics {
    private final int strength;
    private final int weaponsSkill;
    private final int ballisticsSkill;
    private final int toughness;
    private final int agility;
    private final int intelligence;
    private final int willPower;
    private final int fellowship;
    private final int attacks;
    private final int strenghtBonus;
    private final int toughnessBonus;

    Statistics(int strength, int weaponsSkill, int ballisticsSkill, int toughness, int agility, int intelligence, int willPower, int fellowship, int attacks, int strenghtBonus, int toughnessBonus) {
        this.strength = strength;
        this.weaponsSkill = weaponsSkill;
        this.ballisticsSkill = ballisticsSkill;
        this.toughness = toughness;
        this.agility = agility;
        this.intelligence = intelligence;
        this.willPower = willPower;
        this.fellowship = fellowship;
        this.attacks = attacks;
        this.strenghtBonus = strenghtBonus;
        this.toughnessBonus = toughnessBonus;
    }

    public static StatisticsBuilder builder() {
        return new StatisticsBuilder();
    }
}
