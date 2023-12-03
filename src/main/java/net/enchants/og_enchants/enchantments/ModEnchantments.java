package net.enchants.og_enchants.enchantments;

import net.enchants.og_enchants.enchantments.Wither;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.enchants.og_enchants.og_enchants;

public class ModEnchantments {
    public static Enchantment Levi = register("levi", new Levi(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

   public static Enchantment Wither = register("witherenchantment", new Wither(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

   public static Enchantment Inky = register("inkyenchantment", new Inky(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

   public static Enchantment Lifesteal = register("lifestealenchantment", new Lifesteal(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

   public static Enchantment Strength = register("strengthenchantment", new Strength(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

   public static Enchantment Lightning = register("lightningenchantment", new Lightning(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

   public static Enchantment Speedy = register("speedy", new Speedy(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.ARMOR_FEET, EquipmentSlot.FEET));

   public static Enchantment Molten = register("molten", new Molten(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.ARMOR_LEGS, EquipmentSlot.LEGS));



    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(og_enchants.MOD_ID, name), enchantment);
    }


    public static void registerModEnchanments() {
        System.out.println("Registering ModEnchantments for " + og_enchants.MOD_ID);
    }
}
