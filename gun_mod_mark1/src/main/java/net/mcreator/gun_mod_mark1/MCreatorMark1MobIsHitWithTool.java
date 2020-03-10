package net.mcreator.gun_mod_mark1;

@Elementsgun_mod_mark1.ModElement.Tag
public class MCreatorMark1MobIsHitWithTool extends Elementsgun_mod_mark1.ModElement {
	public MCreatorMark1MobIsHitWithTool(Elementsgun_mod_mark1 instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorMark1MobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
		entity.setFire((int) 5);
	}
}
