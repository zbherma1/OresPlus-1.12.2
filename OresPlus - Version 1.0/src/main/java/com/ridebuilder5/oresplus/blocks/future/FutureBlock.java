package com.ridebuilder5.oresplus.blocks.future;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FutureBlock extends BlockBase {

	public FutureBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
        setHardness(5.0f);
        setResistance(22.5f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0.2f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}
