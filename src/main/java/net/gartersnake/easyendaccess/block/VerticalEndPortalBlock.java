package net.gartersnake.easyendaccess.block;

import net.gartersnake.easyendaccess.entity.ModBlockEntities;
import net.gartersnake.easyendaccess.entity.VerticalEndPortalBlockEntity;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VerticalEndPortalBlock extends CustomPortalBlock implements BlockEntityProvider {

    public VerticalEndPortalBlock(Settings settings) {
        super(settings);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {

        double startPos = 0.1238F;
        double endPos = 0.8762F;
        double difference = endPos - startPos;

        double x = random.nextDouble() * difference + startPos;
        double y = random.nextDouble() * difference + startPos;

        double d = (double)pos.getX() + x;
        double e = (double)pos.getY() + 1.0D;
        double f = (double)pos.getZ() + y;
        double g = (double)random.nextFloat() * 0.04D;
        world.addParticle(ParticleTypes.SMOKE, d, e, f, 0.0D, g, 0.0D);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VerticalEndPortalBlockEntity(ModBlockEntities.VERTICAL_END_PORTAL, pos, state);
    }
}
