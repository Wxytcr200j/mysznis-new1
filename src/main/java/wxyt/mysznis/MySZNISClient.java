package wxyt.mysznis;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import wxyt.mysznis.initmain.MySZNISBlockLoader;

@Environment(EnvType.CLIENT)
public class MySZNISClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // 客户端初始化代码
        MySZNISBlockLoader.registerBlocksClient();
    }
}
