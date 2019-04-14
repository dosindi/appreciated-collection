package com.github.appreciated.collection.demo.applayout;


import com.github.appreciated.collection.demo.applayout.demo.MyAppLayoutRouterLayout;
import com.github.appreciated.collection.demo.applayout.demo.View1;
import com.github.appreciated.collection.demo.applayout.demo.View2;
import com.github.appreciated.collection.demo.applayout.views.MainView;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.component.iframe.RouteIFrame;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.entity.GithubDependencies;
import com.github.appreciated.demo.helper.entity.GithubUrl;
import com.github.appreciated.demo.helper.view.devices.DeviceType;
import com.github.appreciated.demo.helper.view.devices.PhoneView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("app-layout/")
@BodySize(height = "100%", width = "100%")
public class AppLayoutDemo extends DemoHelperView {

    public AppLayoutDemo() {
        super(new GithubUrl("https://github.com/appreciated/vaadin-app-layout"),
                new GithubDependencies(
                        "https://github.com/PolymerElements/app-layout",
                        "https://github.com/PolymerElements/iron-icons",
                        "https://github.com/PolymerElements/paper-icon-button",
                        "https://github.com/PolymerElements/paper-tabs",
                        "https://github.com/PolymerElements/paper-badge",
                        "https://github.com/appreciated/vaadin-paper-menu-button",
                        "https://github.com/appreciated/paper-ripple",
                        "https://github.com/appreciated/iron-collapse",
                        "https://github.com/appreciated/card"
                )
        );
        withHorizontalHeader("AppLayout", "A responsive layout that allows you to create modern Menus quickly", "./frontend/images/applayout/logo.png")
                .withDevice(new PhoneView(new RouteIFrame(MainView.class).withFullSize()), "Optimized for small screens")
                .withParagraph("Behaviours", "The AppLayout has by default multiple Behaviours available. Try to set them via the menu in the demo above and below")
                .withStylableDevice(new RouteIFrame(MainView.class).withFullSize(), DeviceType.TABLET_LANDSCAPE)
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("app-layout-addon")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven"))
                .withStep("Add App-Layout-Router-Layout Class", "Create a Class that extends AppLayoutRouterLayout and implement the missing methods as shown in the example. The AppLayoutRouterLayout can then be reused in every View by setting it in the Route annotation.",
                        new CodeExample(MyAppLayoutRouterLayout.class))
                .withStep(
                        "Create a View with a @Route Annotation",
                        "Create a View that contains a @Route Annotation that leads to a specific Path and also has the Class that was created above as \"layout=...\". If you now redeploy your application to the path set in the Annotation this view will be wrapped by the AppLayout",
                        new CodeExample(View1.class),
                        new CodeExample(View2.class))
                .withContributorNotice()
                .withDependencyNotice();
    }

}
