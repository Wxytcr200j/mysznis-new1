package wxyt.mysznis.gui;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

@Environment(EnvType.CLIENT)
public class TestGUI extends Screen {
    public TestGUI() {
        // 此参数为屏幕的标题，进入屏幕中，复述功能会复述。
        super(Component.literal("我的教程屏幕"));
    }

    public Button button1;
    public Button button2;

    @Override
    protected void init() {
        // 计算按钮位置 - 屏幕居中显示两个按钮
        button1 = new Button(width / 2 - 205, 20, 200, 20,Component.literal("按钮 1"), button -> {
                    System.out.println("你点击了按钮 1！");
                });

        button2 = new Button(width / 2 + 5, 20, 200, 20,Component.literal("按钮 2"), button -> {
                    System.out.println("你点击了按钮 2！");
                });

        addRenderableWidget(button1);
        addRenderableWidget(button2);
    }

    public void setScreen() {
        Minecraft.getInstance().setScreen(this);
    }
}