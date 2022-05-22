package com.therealm18studios.beyond_planets_machines.machines.solar.tile;

import com.therealm18studios.beyond_planets_machines.guis.screens.solarpanels.SolarPanelT2Gui;
import com.therealm18studios.beyond_planets_machines.registries.BlockEntitiesRegistry;
import java.util.Arrays;
import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.mrscauthd.beyond_earth.machines.tile.GeneratorBlockEntity;

public class SolarPanelT2BlockEntity extends GeneratorBlockEntity {

    public static final int ENERGY_PER_TICK = 320;

    public SolarPanelT2BlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntitiesRegistry.SOLAR_PANEL_T2_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory) {
        return new SolarPanelT2Gui.GuiContainer(id, inventory, this);
    }

    protected int getGenerationInTick() {
        return this.getMaxGeneration();
    }

    @Override
    public int getMaxGeneration() {
        return ENERGY_PER_TICK;
    }

    @Override
    protected boolean canGenerateEnergy() {
        Level level = this.getLevel();
        BlockPos blockPos = new BlockPos(this.getBlockPos().getX(), this.getBlockPos().getY() + 1, this.getBlockPos().getZ());

        return level.isDay() && level.canSeeSky(blockPos);
    }

    @Override
    protected void generateEnergy() {
        this.generateEnergy(this.getGenerationInTick());
    }

    @Override
    protected List<Direction> getEjectDirections() {
        List<Direction> list = super.getEjectDirections();
        list.addAll(Arrays.stream(Direction.values()).filter(d -> d != Direction.UP).toList());
        return list;
    }
}