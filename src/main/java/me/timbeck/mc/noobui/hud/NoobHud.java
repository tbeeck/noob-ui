package me.timbeck.mc.noobui.hud;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class NoobHud {
    private final MinecraftClient minecraftClient;
    private final HudRenderer hudRenderer;
    private final HudDataHelper dataHelper;

    public NoobHud(MinecraftClient minecraftClient) {
        this.minecraftClient = minecraftClient;
        this.hudRenderer = new HudRenderer();
        this.dataHelper = new HudDataHelper(minecraftClient);
    }

    public void draw(MatrixStack matrixStack) {

    }
}
