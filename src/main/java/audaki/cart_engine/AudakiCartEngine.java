package audaki.cart_engine;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.vehicle.AbstractMinecart;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AudakiCartEngine implements ModInitializer {
    public static List<Function<AbstractMinecart, Boolean>> CART_CHECK_MODIFIED_ENGINE = new ArrayList<>();

    // Function should take one AbstractMinecart. Return true to force
    // modified speed logic, false to force vanilla speed logic, and null
    // otherwise.
    public static void registerModifiedEngineCheck(Function<AbstractMinecart, Boolean> cartChecker) {
        CART_CHECK_MODIFIED_ENGINE.add(cartChecker);
    }

    public void onInitialize() {
    }
}