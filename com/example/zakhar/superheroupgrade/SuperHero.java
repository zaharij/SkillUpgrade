package com.example.zakhar.superheroupgrade;

import static com.example.zakhar.superheroupgrade.Constants.*;

/**
 * Created by Zakhar on 24.10.2016.
 */

public class SuperHero {
    private double account;
    private Integer skillLevel = LEVEL_DEFAULT;

    public double getAccount() {
        return account;
    }

    /**
     * replenishes the hero's account
     * @param account
     */
    public void setAccount(double account) {
        this.account += account;
    }

    public Integer getSkillLevel() {
        return skillLevel;
    }

    /**
     * upgrades hero's skill level
     * @return
     */
    public String upgradeLevel() {
        double upgradePrice = UPGRADE_COST * (skillLevel * UPGRADE_COEFFICIENT);
        if (account < upgradePrice){
            return NOT_ENOUGH_MONEY_WARN;
        } else if (skillLevel >= LEVEL_MAX){
            return MAX_LEVEL_WARN;
        } else {
            account -= upgradePrice;
            skillLevel++;
            return UPGRADE_SUCC.concat(getSkillLevel().toString());
        }
    }

    /**
     * returns the damage by the formula: Base*(percentage - (level)*0.5)*level)+Base
     * @param fireSkillMapKey - choosen entity
     * @return damage (double)
     */
    public double getDamage(String fireSkillMapKey){
        return FIRE_SKILL_MAP.get(fireSkillMapKey).get(BASE_KEY)
                * (FIRE_SKILL_MAP.get(fireSkillMapKey).get(PERCENTAGE_KEY)
                - (skillLevel * UPGRADE_COEFFICIENT))* skillLevel
                + FIRE_SKILL_MAP.get(fireSkillMapKey).get(BASE_KEY);
    }
}
