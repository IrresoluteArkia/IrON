package com.irar.iron.gui.client;

import com.irar.iron.items.ItemCatalyst;
import com.irar.iron.gui.container.ContainerCatalystTierIridium;
import com.irar.iron.gui.container.ContainerCatalystTierSeptridium;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiCatalystTierSeptridium extends GuiContainer {

	private IInventory playerInv;
	private ItemCatalyst.CatalystCraftingInventory cci;

	public GuiCatalystTierSeptridium(InventoryPlayer playerInv, ItemCatalyst.CatalystCraftingInventory cci) {
	    super(new ContainerCatalystTierSeptridium(playerInv, cci));

	    this.playerInv = playerInv;
	    this.cci = cci;

	    this.xSize = 176;
	    this.ySize = 186;
	}

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("iron:textures/gui/container/catalyst_tier_iridium.png"));
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
    
    /**
     * Draws the screen and all the components in it.
     */
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.fontRenderer.drawString(this.cci.getDisplayName().getUnformattedText(), 8, 4, 4210752);
        this.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }
    
}