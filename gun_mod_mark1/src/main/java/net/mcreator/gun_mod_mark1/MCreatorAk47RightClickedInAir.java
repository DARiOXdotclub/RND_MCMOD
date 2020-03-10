package net.mcreator.gun_mod_mark1;

@Elementsgun_mod_mark1.ModElement.Tag
public class MCreatorAk47RightClickedInAir extends Elementsgun_mod_mark1.ModElement {
	public MCreatorAk47RightClickedInAir(Elementsgun_mod_mark1 instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorAk47RightClickedInAir!");
			return;
		}
		World world = (World) dependencies.get("world");
		world.setDayTime((int) 54);
	}
}
