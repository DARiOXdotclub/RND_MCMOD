/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.gun_mod_mark1;

import net.minecraftforge.fml.ModList;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class Elementsgun_mod_mark1 {
	protected final List<ModElement> elements = new ArrayList<>();
	protected final List<Supplier<Block>> blocks = new ArrayList<>();
	protected final List<Supplier<Item>> items = new ArrayList<>();
	protected final List<Supplier<Biome>> biomes = new ArrayList<>();
	protected final List<Supplier<EntityType<?>>> entities = new ArrayList<>();

	public Elementsgun_mod_mark1() {
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("gun_mod_mark1").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == Elementsgun_mod_mark1.ModElement.class)
						elements.add((Elementsgun_mod_mark1.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(Elementsgun_mod_mark1.ModElement::initElements);
		this.addNetworkMessage(gun_mod_mark1Variables.WorldSavedDataSyncMessage.class, gun_mod_mark1Variables.WorldSavedDataSyncMessage::buffer,
				gun_mod_mark1Variables.WorldSavedDataSyncMessage::new, gun_mod_mark1Variables.WorldSavedDataSyncMessage::handler);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData mapdata = gun_mod_mark1Variables.MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = gun_mod_mark1Variables.WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				gun_mod_mark1.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new gun_mod_mark1Variables.WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				gun_mod_mark1.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new gun_mod_mark1Variables.WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData worlddata = gun_mod_mark1Variables.WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				gun_mod_mark1.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new gun_mod_mark1Variables.WorldSavedDataSyncMessage(1, worlddata));
		}
	}
	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		gun_mod_mark1.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final Elementsgun_mod_mark1 elements;
		protected final int sortid;

		public ModElement(Elementsgun_mod_mark1 elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
