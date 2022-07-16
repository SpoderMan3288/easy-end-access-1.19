package net.gartersnake.easyendaccess.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.EndPortalBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class VerticalEndPortalBlockEntity extends EndPortalBlockEntity {
    public VerticalEndPortalBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public VerticalEndPortalBlockEntity(BlockPos pos, BlockState state) {

        super(BlockEntityType.END_GATEWAY, pos, state);

    }

    public boolean shouldDrawSide(Direction direction) {
        return Block.shouldDrawSide(this.getCachedState(),
                this.world, this.getPos(), direction, this.getPos().offset(direction));
    }
}
