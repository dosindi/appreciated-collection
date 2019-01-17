package com.github.appreciated.collection.demo.papermenubutton;


import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-menu-button/")
@BodySize(height = "100%", width = "100%")
public class PaperMenuButtonDemo extends VerticalLayout {

    public PaperMenuButtonDemo() {
        add(new DemoHelperView()
                .withVerticalHeader("VerticalHeaderView",
                        "I can display a header and an optionally an image or a subtitle",
                        "./frontend/images/no-logo.png"
                )
        );
    }
}
