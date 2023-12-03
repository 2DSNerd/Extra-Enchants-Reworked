// Doesnt Work Yet

package net.enchants.og_enchants.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;

public class Lightning extends Enchantment {
    public Lightning(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient() && user.getWorld() instanceof ServerWorld world && target instanceof LivingEntity) {
            BlockPos pos = target.getBlockPos();

            if (level >= 1 && world.isSkyVisible(pos)) {
                int chance = world.getRandom().nextBetween(1, 10);
                if (chance <= level) {
                    LightningEntity lightning = (LightningEntity) EntityType.LIGHTNING_BOLT.create(world);
                    if (lightning != null) {
                        lightning.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(pos));
                        lightning.setChanneler(user instanceof ServerPlayerEntity ? (ServerPlayerEntity) user : null);
                        world.spawnEntity(lightning);
                    }
                }
            }
        }
        super.onTargetDamaged(user, target, level);
    }
}