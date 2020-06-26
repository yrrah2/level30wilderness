package com.level30wilderness;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class Level30WildernessPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(Level30WildernessPlugin.class);
		RuneLite.main(args);
	}
}