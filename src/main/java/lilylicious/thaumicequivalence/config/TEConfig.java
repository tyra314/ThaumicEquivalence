package lilylicious.thaumicequivalence.config;

import lilylicious.thaumicequivalence.utils.TELogger;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class TEConfig
{
	public static boolean enableDebugLog;
	public static boolean enableHardMode;

	public static void init(File configFile)
	{
		Configuration config = new Configuration(configFile);
		try
		{
			config.load();

			enableDebugLog = config.getBoolean("debugLogging", "misc", false, "Enable a more verbose debug logging");
			enableHardMode = config.getBoolean("hardMode", "difficulty", true, "Enable enforced progression and recipe removals");

			//archangelPedCooldown = config.getInt("archangelPedCooldown", "pedestalcooldown", 100, -1, Integer.MAX_VALUE, "Delay between Archangel Smite shooting arrows while in the pedestal.");

			//timePedMobSlowness = config.getFloat("timePedMobSlowness", "effects", 0.10F, 0.0F, 1.0F, "Factor the Watch of Flowing Time slows down mobs by while in the pedestal. Set to 1.0 for no slowdown.");
			TELogger.logInfo("Loaded configuration file.");
		}
		catch (Exception e)
		{
			TELogger.logFatal("Caught exception while loading config file!");
			e.printStackTrace();
		}
		finally
		{
			if (config.hasChanged())
			{
				config.save();
			}
		}
	}
}