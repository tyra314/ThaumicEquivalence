package lilylicious.thaumicequivalence.emc;

import com.google.common.collect.ImmutableMap;
import lilylicious.thaumicequivalence.config.TEConfig;
import moze_intel.projecte.api.ProjectEAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import thaumcraft.api.ItemApi;
import thaumcraft.api.aspects.Aspect;

public class ManualEMC
{
	
	private static int tempInt = 0;
	
	public static void addEMC()
	{
		ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getItem("itemThaumonomicon", 0), ImmutableMap.<Object, Integer>of(Blocks.bookshelf, 1));
		ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockMetalDevice", 0), ImmutableMap.<Object, Integer>of(Items.cauldron, 1));
		ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockCustomPlant", 5), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 2, AspectMapper.objectMap.get(Aspect.POISON.getTag()), 1, AspectMapper.objectMap.get(Aspect.MAGIC.getTag()), 2));
		ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockTable", 15), ImmutableMap.<Object, Integer>of(ItemApi.getBlock("blockTable", 0), 1));
		ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getItem("itemResource", 18), ImmutableMap.<Object, Integer>of(Items.gold_nugget, 1));

		if (TEConfig.taintEMC)
		{
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockTaint", 0), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 3, AspectMapper.objectMap.get(Aspect.TREE.getTag()), 1));
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockTaint", 1), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 3, AspectMapper.objectMap.get(Aspect.EARTH.getTag()), 1));
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockTaintFibres", 0), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 2, AspectMapper.objectMap.get(Aspect.LIFE.getTag()), 1));
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockTaintFibres", 1), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 1, AspectMapper.objectMap.get(Aspect.LIFE.getTag()), 1));
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockTaintFibres", 2), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 1, AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 1));
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getBlock("blockTaintFibres", 3), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 2, AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 1, AspectMapper.objectMap.get(Aspect.BEAST.getTag()), 1));
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getItem("itemResource", 11), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 3, AspectMapper.objectMap.get(Aspect.SLIME.getTag()), 1));
			ProjectEAPI.getConversionProxy().addConversion(1, ItemApi.getItem("itemResource", 12), ImmutableMap.<Object, Integer>of(AspectMapper.objectMap.get(Aspect.TAINT.getTag()), 1, AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 1));
		}
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getBlock("blockCustomPlant", 2), TEConfig.shimmerLeafValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getBlock("blockCustomPlant", 3), TEConfig.cinderpearlValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemResource", 3), TEConfig.quicksilverValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemResource", 6), TEConfig.amberValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemResource", 9), TEConfig.knowledgeFragmentValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemZombieBrain", 0), TEConfig.brainValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getBlock("blockMagicalLeaves", 0), TEConfig.greatwoodLeafValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getBlock("blockMagicalLeaves", 1), TEConfig.silverWoodLeafValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemEldritchObject", 3), 16 * TEConfig.aerValue + 16 * TEConfig.terraValue + 16 * TEConfig.ignisValue + 16 * TEConfig.aquaValue + 16 * TEConfig.ordoValue + 16 * TEConfig.perditioValue + TEConfig.primordialPearlAddition);
		ProjectEAPI.getEMCProxy().registerCustomEMC(AspectMapper.objectMap.get("instability"), TEConfig.instabilityValue);
	}
}
