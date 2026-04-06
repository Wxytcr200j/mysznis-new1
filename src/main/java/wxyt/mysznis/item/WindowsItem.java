package wxyt.mysznis.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import wxyt.mysznis.MySZNIS;
import wxyt.mysznis.itemgroup.MySZNISItemGroup;
import wxyt.mysznis.block.WindowsBlock;

public class WindowsItem {
    private final Item WINDOW_ITEM;
    private final String ITEM_ID;

    public WindowsItem(String itemId, WindowsBlock baseBlock) {
        this.WINDOW_ITEM = new BlockItem(
                baseBlock.getWindows_Block(),
                new FabricItemSettings().group(MySZNISItemGroup.ITEM_GROUP)
        );
        this.ITEM_ID = itemId;
    }

    public Item getWINDOW_ITEM() {
        return this.WINDOW_ITEM;
    }

    public void registerItems() {
        Registry.register(
                Registry.ITEM,
                new ResourceLocation(MySZNIS.MOD_ID, this.ITEM_ID),
                this.WINDOW_ITEM
        );
    }
}