package com.github.appreciated.collection.demo.demohelper.demo;

import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.button.Button;

public class DemoHelperHeaderExample extends DemoHelperView {

    public DemoHelperHeaderExample() {
        withVerticalHeader("VerticalHeaderView",
                "I can display a header and an optionally an image or a subtitle",
                "./frontend/images/demohelper/logo.png"
        )
                .withHorizontalHeader("HorizontalHeaderView",
                        "I can display a header and optionally an image or I am suited for longer description texts. Additionally I may contain Components which are display beneath the description that can be used to display f.e. links",
                        "./frontend/images/demohelper/logo.png",
                        new Button("Click Me!")
                );
    }

}