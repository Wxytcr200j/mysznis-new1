package wxyt.mysznis.initmain;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import wxyt.mysznis.block.WindowsBlock;


public class MySZNISBlockLoader {
    public static WindowsBlock WINDOW_BLOCK_B=new  WindowsBlock("window_block_b","15,0,0,16,16,16/0,0,0,1,16,16/1,0,13,15,16,16");

    public static WindowsBlock WINDOW_BLOCK_A=new  WindowsBlock("window_block_a","15,0,0,16,16,16/0,0,0,1,16,16/1,0,14,15,16,16");

    public static void registerBlocks(){
        WINDOW_BLOCK_A.registerBlocks();
        WINDOW_BLOCK_B.registerBlocks();

    }
    @Environment(EnvType.CLIENT)
    public static void registerBlocksClient(){
        WINDOW_BLOCK_A.registerBlocksClient();
    }
}