package com.github.appreciated.collection.demo.masterdetail;


import com.github.appreciated.collection.demo.masterdetail.demo.DetailDemoView;
import com.github.appreciated.collection.demo.masterdetail.demo.MasterDemoView;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.component.browser.HasParameterRouteBrowser;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.view.devices.DeviceType;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Push
@Route("masterdetail/")
@BodySize(height = "100%", width = "100%")
public class MasterDetailDemo extends DemoHelperView {

    public MasterDetailDemo() {
        withHorizontalHeader("Master/Detail View",
                "\"The Master/Detail Pattern can be used to hide / reveal content if space is available.",
                "./frontend/images/masterdetail/logo.png"
        ).withThemeableAndStylableDevice(new HasParameterRouteBrowser<>(MasterDemoView.class, 1), DeviceType.TABLET_LANDSCAPE)
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample(new AppreciatedDependencyReader("master-detail-view")))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("install", Language.markup, "Maven"))
                .resetCounterStep()
                .withStep("Some code examples", "You can setup a master Detail View the following way",
                        new CodeExample(MasterDemoView.class),
                        new CodeExample(DetailDemoView.class)
                );
    }

}
