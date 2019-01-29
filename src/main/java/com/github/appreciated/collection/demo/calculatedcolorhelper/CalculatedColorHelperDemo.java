package com.github.appreciated.collection.demo.calculatedcolorhelper;


import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("calculated-color-helper/")
@BodySize(height = "100%", width = "100%")
public class CalculatedColorHelperDemo extends DemoHelperView {

    public CalculatedColorHelperDemo() {
        withVerticalHeader("VerticalHeaderView",
                "I can display a header and an optionally an image or a subtitle",
                "./frontend/images/no-logo.png"
        );
    }
}
