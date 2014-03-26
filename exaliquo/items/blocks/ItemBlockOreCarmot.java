package exaliquo.items.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import exaliquo.Registries;

public class ItemBlockOreCarmot extends ItemBlock
{
	private String name = this.getClass().getSimpleName().substring(12);
	
	public ItemBlockOreCarmot(int id)
	{
		super(id);
		setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack item)
	{
			return "block.ExAliquo."+ name + Registries.oreType[item.getItemDamage()];
	}
	
	public int getMetadata (int meta)
    {
        return meta;
    }
}
