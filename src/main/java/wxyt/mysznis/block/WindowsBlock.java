package wxyt.mysznis.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.level.block.Block;
import wxyt.mysznis.data.BlockWithFacing;
import net.minecraft.world.level.material.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import wxyt.mysznis.MySZNIS;

// 客户端相关导入 - 需要放在客户端代码中
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class WindowsBlock {
    private final String BLOCK_ID;
    private final Block Windows_Block;

    public WindowsBlock(String blockId, String shape){
        this.Windows_Block = new BlockWithFacing(
                FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque(),
                shape
        );
        this.BLOCK_ID = blockId;
    }

    public Block getWindows_Block(){
        return this.Windows_Block;
    }

    public void registerBlocks() {
        // 注册方块到游戏注册表
        Registry.register(
                Registry.BLOCK,
                new ResourceLocation(MySZNIS.MOD_ID, this.BLOCK_ID),
                this.Windows_Block
        );

    }
    @Environment(EnvType.CLIENT)
    // 客户端专用方法 - 需要放在客户端代码中
    public void registerBlocksClient() {

                BlockRenderLayerMap.INSTANCE.putBlock(
                this.getWindows_Block(),
                RenderType.translucent()
        );
    }
}