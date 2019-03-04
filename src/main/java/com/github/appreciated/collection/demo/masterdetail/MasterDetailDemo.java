package com.github.appreciated.collection.demo.masterdetail;


import com.github.appreciated.collection.demo.masterdetail.demo.DetailDemoView;
import com.github.appreciated.collection.demo.masterdetail.demo.MasterDemoView;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.component.iframe.HasParameterRouteIFrame;
import com.github.appreciated.demo.helper.view.devices.DeviceType;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("masterdetail/")
@BodySize(height = "100%", width = "100%")
public class MasterDetailDemo extends DemoHelperView {

    public MasterDetailDemo() {
        withHorizontalHeader("Card",
                "\"Cards are surfaces that display content and actions on a single topic.\n" +
                        "\n" +
                        "They should be easy to scan for relevant and actionable information. Elements, like text and images, should be placed on them in a way that clearly indicates hierarchy.\"\n" +
                        "- material.io",
                "./frontend/images/no-logo.png"
        ).withThemeableAndStylableDevice(new HasParameterRouteIFrame<>(MasterDemoView.class, 1), DeviceType.TABLET_LANDSCAPE)
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample(new AppreciatedDependencyReader("card")))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("install", Language.markup, "Maven"))
                .resetCounterStep()
                .withStep("Some code examples", "You can add cards to your View the following way",
                        new CodeExample(MasterDemoView.class),
                        new CodeExample(DetailDemoView.class)
                );
    }

}
