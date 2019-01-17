package com.github.appreciated.collection.demo.prismelement;


import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("prism-element/")
@BodySize(height = "100%", width = "100%")
public class PrismElementDemo extends VerticalLayout {

    public PrismElementDemo() {
        add(new DemoHelperView()
                .withVerticalHeader("VerticalHeaderView",
                        "I can display a header and an optionally an image or a subtitle",
                        "./frontend/images/no-logo.png"
                )
        );
    }
}
