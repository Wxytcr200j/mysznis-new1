package wxyt.mysznis.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.minecraft.core.Registry;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import wxyt.mysznis.MySZNIS;
import wxyt.mysznis.initmain.MySZNISItemLoader;

public class MySZNISItemGroup {
    // 创建创造模式标签
    public static final CreativeModeTab ITEM_GROUP = FabricItemGroupBuilder.create(new ResourceLocation(MySZNIS.MOD_ID,"item_group"))
            .icon(()->new ItemStack(MySZNISItemLoader.WINDOW_A.getWINDOW_ITEM())) // 设置标签图标
            .build();

    public static void registerItemGroups() {
        // 注册创造模式标签

    }
}