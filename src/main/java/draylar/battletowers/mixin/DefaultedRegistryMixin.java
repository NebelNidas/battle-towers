package draylar.battletowers.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(DefaultedRegistry.class)
public class DefaultedRegistryMixin {
	@ModifyVariable(at = @At("HEAD"), method = "get(Lnet/minecraft/util/Identifier;)Ljava/lang/Object;", ordinal = 0)
	Identifier fixMissingFromRegistry(@Nullable Identifier id) {
		if(id != null) {
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_helmet")) {
				return new Identifier("minecraft", "diamond_helmet");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_chestplate")) {
				return new Identifier("minecraft", "diamond_chestplate");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_leggings")) {
				return new Identifier("minecraft", "diamond_leggings");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_boots")) {
				return new Identifier("minecraft", "diamond_boots");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_sword")) {
				return new Identifier("minecraft", "diamond_sword");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_axe")) {
				return new Identifier("minecraft", "diamond_axe");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_hoe")) {
				return new Identifier("minecraft", "diamond_hoe");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_pickaxe")) {
				return new Identifier("minecraft", "diamond_pickaxe");
			}
			if (id.getNamespace().equals("battletowers") && id.getPath().equals("key_shovel")) {
				return new Identifier("minecraft", "diamond_shovel");
			}
		}
		return id;
	}
}
