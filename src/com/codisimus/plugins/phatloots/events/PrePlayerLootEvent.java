package com.codisimus.plugins.phatloots.events;

import com.codisimus.plugins.phatloots.PhatLoot;
import com.codisimus.plugins.phatloots.PhatLootChest;
import org.bukkit.entity.Player;

/**
 * Called before a Player loots a PhatLoot
 *
 * @author Cody
 */
public class PrePlayerLootEvent extends PreLootEvent {
    private Player looter;
    private PhatLoot phatLoot;
    private PhatLootChest chest;

    /**
     * Creates a new event with the given data
     *
     * @param looter The Player who is looting
     * @param phatLoot The PhatLoot that the Player looted
     * @param chest The PhatLootChest being looted or null if no chest was involved
     * @param lootingBonus The bonus amount of looting probability
     */
    public PrePlayerLootEvent(Player looter, PhatLoot phatLoot, PhatLootChest chest, double lootingBonus) {
        this.looter = looter;
        this.phatLoot = phatLoot;
        this.chest = chest;
        this.lootingBonus = lootingBonus;
    }

    /**
     * Returns the Player who is looting
     *
     * @return The Player who is looting
     */
    public Player getLooter() {
        return looter;
    }

    /**
     * Returns the PhatLoot that provided the loot
     *
     * @return The PhatLoot that provided the loot
     */
    public PhatLoot getPhatLoot() {
        return phatLoot;
    }

    /**
     * Returns the chest that is being looted
     *
     * @return The PhatLootChest being looted or null if no chest was involved
     */
    public PhatLootChest getChest() {
        return chest;
    }
}