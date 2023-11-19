package com.chaosthedude.realistictorches.blocks;

import com.chaosthedude.realistictorches.RealisticTorches;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTorchLitByTorch extends BlockTorchLit {

	public static final String NAME = "torch_lit_by_torch";

	public BlockTorchLitByTorch() {
		setUnlocalizedName(RealisticTorches.MODID + "." + NAME);
		setLightLevel(0.9375F);
		setTickRandomly(true);
		setLit(true);
		setLitByTorch(true);
		setCreativeTab(CreativeTabs.DECORATIONS);
	}
}
