package net.mcreator.gun_mod_mark1;

@Elementsgun_mod_mark1.ModElement.Tag
public class MCreatorPistolWhileBulletFlyingTick extends Elementsgun_mod_mark1.ModElement {
	public MCreatorPistolWhileBulletFlyingTick(Elementsgun_mod_mark1 instance) {
		super(instance, 20);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPistolWhileBulletFlyingTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.remove();
	}
}
