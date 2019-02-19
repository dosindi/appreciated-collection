package com.github.appreciated.collection.demo.gridlayout;


import com.github.appreciated.collection.demo.gridlayout.demo.AreaLayoutExample;
import com.github.appreciated.collection.demo.gridlayout.demo.CssGridLayoutExample1;
import com.github.appreciated.collection.demo.gridlayout.demo.FlexibleGridLayoutExample;
import com.github.appreciated.collection.demo.gridlayout.demo.FlexibleGridLayoutExample2;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.DeviceType;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("grid-layout/")
@BodySize(height = "100%", width = "100%")
public class GridLayoutDemo extends DemoHelperView {

    public GridLayoutDemo() {
        withHorizontalHeader("Css Grid Layout",
                "Create flexible layouts easily by using an advanced api",
                "./frontend/images/gridlayout/grid-layout-logo.png"
        ).withThemeableAndStylableDevice(new FlexibleGridLayoutExample(), DeviceType.TABLET_LANDSCAPE)
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample(new AppreciatedDependencyReader("vaadin-css-grid")))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("install", Language.markup, "Maven"))
                .withStep("How to initialize a Flexible Grid Layout", "You can create a flexible grid the following way",
                        new CodeExample(FlexibleGridLayoutExample.class))
                .withStep("Flexible Grid Layout with multi column/row items ", "You can create a flexible grid with an item that spans over multiple rows / columns the following way",
                        new CodeExample(FlexibleGridLayoutExample2.class))
                .withStep("How to initialize an Area Layout", "You can create a area based layout the following way",
                        new CodeExample(AreaLayoutExample.class))
                .withStep("How to use the css grid directly", "You can use the css grid directly the following way",
                        new CodeExample(CssGridLayoutExample1.class),
                        new CodeExample(CssGridLayoutExample1.class)
                );
    }
}
