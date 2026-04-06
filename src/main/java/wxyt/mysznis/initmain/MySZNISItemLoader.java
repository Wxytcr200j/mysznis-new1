package wxyt.mysznis.initmain;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import wxyt.mysznis.item.WindowsItem;

public class MySZNISItemLoader {
    public static WindowsItem WINDOW_A = new WindowsItem("window_a", MySZNISBlockLoader.WINDOW_BLOCK_A);
    public static WindowsItem WINDOW_B = new WindowsItem("window_b", MySZNISBlockLoader.WINDOW_BLOCK_B);

    // 1. 首先，创建（实例化）物品对象
    public static void registerItems(){
        WINDOW_A.registerItems();
        WINDOW_B.registerItems();

    }


}