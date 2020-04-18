
package net.mcreator.aaaaaaaaaaaaaaaaaa.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.aaaaaaaaaaaaaaaaaa.creativetab.TabNokai;
import net.mcreator.aaaaaaaaaaaaaaaaaa.ElementsAaaaaaaaaaaaaaaaaa;

@ElementsAaaaaaaaaaaaaaaaaa.ModElement.Tag
public class ItemNokia3310 extends ElementsAaaaaaaaaaaaaaaaaa.ModElement {
	@GameRegistry.ObjectHolder("aaaaaaaaaaaaaaaaaa:nokia3310")
	public static final Item block = null;
	public ItemNokia3310(ElementsAaaaaaaaaaaaaaaaaa instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("aaaaaaaaaaaaaaaaaa:nokia3310", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("nokia3310");
			setRegistryName("nokia3310");
			setCreativeTab(TabNokai.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
