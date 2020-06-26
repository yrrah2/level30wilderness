package com.level30wilderness;

import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
		name = "Level 30 Wilderness",
		description = "Highlights the line marking level 30 wilderness",
		tags = {"highlight", "lines", "wilderness", "teleport"}
)
public class Level30WildernessPlugin extends Plugin{

	@Inject
	private Level30WildernessOverlay config;

	@Inject
	private Level30WildernessOverlay overlay;

	@Inject
	private OverlayManager overlayManager;

	@Override
	protected void startUp() throws Exception {
		overlayManager.add(overlay);
	}

	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
	}
}