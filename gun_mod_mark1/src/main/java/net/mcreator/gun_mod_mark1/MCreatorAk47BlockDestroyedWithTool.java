package net.mcreator.gun_mod_mark1;

import java.util.Random;
import java.util.HashMap;

@Elementsgun_mod_mark1.ModElement.Tag
public class MCreatorAk47BlockDestroyedWithTool extends Elementsgun_mod_mark1.ModElement {
	public MCreatorAk47BlockDestroyedWithTool(Elementsgun_mod_mark1 instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorAk47BlockDestroyedWithTool!");
			return;
		}
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		{
			IInventory inv = (IInventory) guiinventory.get("ak47");
			if (inv != null) {
				ItemStack stack = inv.getStackInSlot((int) (0));
				if (stack != null)
					if (stack.attemptDamageItem((int) 3, new Random(), null)) {
						stack.shrink(1);
						stack.setDamage(0);
					}
			}
		}
	}
}
