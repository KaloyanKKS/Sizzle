package me.kaloyankys.sizzle.item;

import net.minecraft.item.Item;

public class SandwhichItem extends Item {
    public boolean meat;
    public boolean lettuce;
    public boolean tomato;
    public boolean cucumber;
    public int crunch;
    public int taste;
    public int nourishment;

    public SandwhichItem(Settings settings) {
        super(settings);
    }
}
