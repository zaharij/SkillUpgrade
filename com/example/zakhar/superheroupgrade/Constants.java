package com.example.zakhar.superheroupgrade;

import java.util.HashMap;

/**
 * Created by Zakhar on 24.10.2016.
 */

public class Constants {
    public final static String ENVIRONMENT_KEY = "Environment";
    public final static String HUMAN_KEY = "Human";
    public final static String TECHNOGEN_KEY = "Technogen";

    public final static String BASE_KEY = "Base";
    public final static String PERCENTAGE_KEY = "Percentage";

    public final static HashMap<String, HashMap<String, Integer>> FIRE_SKILL_MAP = new HashMap<String, HashMap<String, Integer>>()
    {{
        put(ENVIRONMENT_KEY, new HashMap<String, Integer>(){{put(BASE_KEY, 20); put(PERCENTAGE_KEY, 10);}});
        put(HUMAN_KEY, new HashMap<String, Integer>(){{put(BASE_KEY, 40); put(PERCENTAGE_KEY, 15);}});
        put(TECHNOGEN_KEY, new HashMap<String, Integer>(){{put(BASE_KEY, 10); put(PERCENTAGE_KEY, 5);}});
    }};

    public final static int LEVEL_DEFAULT = 1;
    public final static int LEVEL_MAX = 10;
    public final static double UPGRADE_COEFFICIENT = 0.5;
    public final static double UPGRADE_COST = 1000;

    public final static String REPLENISH_SUCC = "replenished successfully, your account: ";
    public final static String PUT_MONEY = "put money!";
    public final static String UPGRADE_SUCC = "upgraded successfully, your level: ";
    public final static String AUTOUPGR_WORN = "automatical upgrading is active";
    public final static String NOT_ENOUGH_MONEY_WARN = "you have not enough money, replenish your account!";
    public final static String MAX_LEVEL_WARN = "you have the highest level!";
}
