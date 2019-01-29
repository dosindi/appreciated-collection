package com.github.appreciated.collection.demo.papercolor;


import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-color/")
@BodySize(height = "100%", width = "100%")
public class PaperColorDemo extends DemoHelperView {

    public PaperColorDemo() {
        withVerticalHeader("VerticalHeaderView",
                "I can display a header and an optionally an image or a subtitle",
                "./frontend/images/no-logo.png"
        );
    }
}
