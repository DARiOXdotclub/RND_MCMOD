package net.mcreator.gun_mod_mark1;

import org.omg.CORBA.ObjectHolder;

import java.util.List;
import java.util.Collections;

@Elementsgun_mod_mark1.ModElement.Tag
public class MCreatorCopperOreBlock extends Elementsgun_mod_mark1.ModElement {
	@ObjectHolder("gun_mod_mark1:copperoreblock")
	public static final Block block = null;

	public MCreatorCopperOreBlock(Elementsgun_mod_mark1 instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("copperoreblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
