package net.mcreator.gun_mod_mark1;

@Elementsgun_mod_mark1.ModElement.Tag
public class MCreatorAk47MobIsHitWithTool extends Elementsgun_mod_mark1.ModElement {
	public MCreatorAk47MobIsHitWithTool(Elementsgun_mod_mark1 instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorAk47MobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 15);
	}
}
