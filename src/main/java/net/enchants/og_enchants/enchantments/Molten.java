package net.enchants.og_enchants.enchantments;

// Importing Minecraft Librarys

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.random.Random;

public class Molten extends Enchantment {
    public Molten(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.ARMOR_LEGS, slotTypes);
    }

    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof ArmorItem ? true : super.isAcceptableItem(stack);
    }


    @Override
    public void onUserDamaged(LivingEntity user, Entity target, int level) {
        // Adds Random Chance To My Code
        int chance = Random.create().nextBetween(1, 10);
        if(chance >= 1 && chance <= 10 && user instanceof LivingEntity) {
            ((LivingEntity) user).addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 60000, 300), user);
        }
    }


}
