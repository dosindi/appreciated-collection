package com.github.appreciated.collection.ironcollapse;


import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("iron-collapse/")
@BodySize(height = "100%", width = "100%")
public class IronCollapseDemo extends VerticalLayout {

    public IronCollapseDemo() {
        add(new DemoHelperView()
                .withVerticalHeader("VerticalHeaderView",
                        "I can display a header and an optionally an image or a subtitle",
                        "images/demohelper-logo.png"
                )
        );
    }
}
