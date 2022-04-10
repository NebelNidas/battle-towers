package draylar.battletowers.registry;

import draylar.battletowers.BattleTowers;
import draylar.battletowers.item.ForeignKeyItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.registry.Registry;

public class BattleTowerItems {

    public static final Item BOSS_KEY = register("boss_key", new Item(new net.minecraft.item.Item.Settings().group(BattleTowers.GROUP)));

    public static final SpawnEggItem TOWER_GUARDIAN_SPAWN_EGG = register(
            "tower_guardian_spawn_egg",
            new SpawnEggItem(
                    BattleTowerEntities.TOWER_GUARD,
                    0xbfbfbf,
                    0xfcba03,
                    new Item.Settings().group(BattleTowers.GROUP)
            )
    );

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, BattleTowers.id(name), item);
    }

    public static void init() {
        register("foreign_key", new ForeignKeyItem(new Item.Settings().group(BattleTowers.GROUP)));
    }

    private BattleTowerItems() {
        // NO-OP
    }
}
