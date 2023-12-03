package net.enchants.og_enchants.enchantments;

//Importing Plugins

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.random.Random;


public class Strength extends Enchantment {
    public Strength(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        // Adds Random Chance
        int chance = Random.create().nextBetween(1, 10);
        if(chance >= 1 && chance <= 3 && user instanceof LivingEntity) {
            ((LivingEntity) user).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60, 3), user);
        }
    }


}
