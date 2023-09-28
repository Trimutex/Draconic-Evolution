package com.brandon3055.draconicevolution.blocks;

import com.brandon3055.brandonscore.blocks.BlockBCore;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

/**
 * Created by brandon3055 on 18/3/2016.
 */
public class DraconiumOre extends BlockBCore {

    public DraconiumOre(Properties properties) {
        super(properties);
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader world, BlockPos pos, int fortune, int silktouch) {
        Random rand = world instanceof Level ? ((Level) world).random : new Random();
        return Mth.nextInt(rand, 5, 12) * fortune;
    }
}
