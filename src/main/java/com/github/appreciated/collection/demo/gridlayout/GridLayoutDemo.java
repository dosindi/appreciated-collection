package com.github.appreciated.collection.demo.gridlayout;


import com.github.appreciated.collection.code.CodeExampleFormatter;
import com.github.appreciated.collection.demo.gridlayout.demo.AreaLayoutExample;
import com.github.appreciated.collection.demo.gridlayout.demo.CssGridLayoutExample1;
import com.github.appreciated.collection.demo.gridlayout.demo.FlexibleGridLayoutExample;
import com.github.appreciated.collection.maven.DependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.DeviceType;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("grid-layout/")
@BodySize(height = "100%", width = "100%")
public class GridLayoutDemo extends DemoHelperView {

    public GridLayoutDemo() {
        withHorizontalHeader("Css Grid Layout",
                "Creating flexible layouts should be easy",
                "./frontend/images/no-logo.png"
        ).withThemeableAndStylableDevice(new FlexibleGridLayoutExample(), DeviceType.TABLET_LANDSCAPE)
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample(new DependencyReader("vaadin-css-grid").getDependencyString(), "xml", "Maven"))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("install", "xml", "Maven"))
                .resetCounterStep()
                .withStep("How to init a FlexibleGridLayout", "You can create a flexible grid the following way",
                        new CodeExample(new CodeExampleFormatter(FlexibleGridLayoutExample.class.getName()).getCodeExample(), "java", "Java")
                ).withStep("How to init a AreaLayout", "You can create a area based layout the following way",
                new CodeExample(new CodeExampleFormatter(AreaLayoutExample.class.getName()).getCodeExample(), "java", "Java")
        ).withStep("How to use the CssGridLayout directly a AreaLayout", "You can use the css grid directly the following way",
                new CodeExample(new CodeExampleFormatter(CssGridLayoutExample1.class.getName()).getCodeExample(), "java", "Java"),
                new CodeExample(new CodeExampleFormatter(CssGridLayoutExample1.class.getName()).getCodeExample(), "java", "Java")
        );
    }
}
