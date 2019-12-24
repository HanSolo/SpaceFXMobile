package eu.hansolo.spacefxmobile;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.scene.Scene;


public class SpaceFX extends MobileApplication {

    @Override public void init() {
        addViewFactory(HOME_VIEW, SpaceFXView::new);
    }

    @Override public void postInit(Scene scene) {
        Swatch.BLUE_GREY.assignTo(scene);
    }
}
