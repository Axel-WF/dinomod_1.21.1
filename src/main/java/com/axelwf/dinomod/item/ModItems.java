package com.axelwf.dinomod.item;

import com.axelwf.dinomod.DinoMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DinoMod.MOD_ID);

    public static final DeferredItem<Item> SOFT_DINOSAUR_LEATHER = ITEMS.register("soft_dinosaur_leather",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HARD_DINOSAUR_LEATHER = ITEMS.register("hard_dinosaur_leather",
            () -> new Item(new Item.Properties()));

    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
