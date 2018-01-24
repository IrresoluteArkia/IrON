package com.irar.iron.gui.client;

import com.irar.iron.gui.container.ContainerTileEntityOreGen;
import com.irar.iron.tileentity.TileEntityOreGen;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiTileEntityOreGen extends GuiContainer {

	private IInventory playerInv;
	private TileEntityOreGen te;

	public GuiTileEntityOreGen(InventoryPlayer playerInv, TileEntityOreGen te) {
	    super(new ContainerTileEntityOreGen(playerInv, te));

	    this.playerInv = playerInv;
	    this.te = te;

	    this.xSize = 176;
	    this.ySize = 166;
	}

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("iron:textures/gui/container/tile_entity_ore_gen.png"));
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
        this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 4, 4210752);
        this.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }
    
}