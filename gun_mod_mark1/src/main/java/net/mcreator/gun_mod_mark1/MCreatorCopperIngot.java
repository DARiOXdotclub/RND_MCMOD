package net.mcreator.gun_mod_mark1;

import org.omg.CORBA.ObjectHolder;

@Elementsgun_mod_mark1.ModElement.Tag
public class MCreatorCopperIngot extends Elementsgun_mod_mark1.ModElement {
	@ObjectHolder("gun_mod_mark1:copperingot")
	public static final Item block = null;

	public MCreatorCopperIngot(Elementsgun_mod_mark1 instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("copperingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
