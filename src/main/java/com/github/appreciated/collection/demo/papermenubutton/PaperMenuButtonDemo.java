package com.github.appreciated.collection.demo.papermenubutton;


import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-menu-button/")
@BodySize(height = "100%", width = "100%")
public class PaperMenuButtonDemo extends DemoHelperView {

    public PaperMenuButtonDemo() {
        withVerticalHeader("VerticalHeaderView",
                "I can display a header and an optionally an image or a subtitle",
                "./frontend/images/no-logo.png"
        );
    }
}
