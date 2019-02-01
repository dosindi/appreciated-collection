package com.github.appreciated.collection.demo.applayout;


import com.github.appreciated.collection.code.CodeExampleFormatter;
import com.github.appreciated.collection.component.Embed;
import com.github.appreciated.collection.demo.applayout.codeexample.View2;
import com.github.appreciated.collection.demo.applayout.codeexample.YourAppLayoutRouterLayout;
import com.github.appreciated.collection.demo.applayout.views.View1;
import com.github.appreciated.collection.maven.DependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.DeviceType;
import com.github.appreciated.demo.helper.view.devices.PhoneView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("app-layout/")
@BodySize(height = "100%", width = "100%")
public class AppLayoutDemo extends DemoHelperView {

    public AppLayoutDemo() {
        withHorizontalHeader("AppLayout", "A responsive layout that allows you to create modern Menus quickly", "./frontend/images/applayout/app-layout-logo.png")
                .withDevice(new PhoneView(new Embed(View1.class).withFullSize()), "Optimized for small screens")
                .withParagraph("Behaviours", "The AppLayout has by default multiple Behaviours availabe. Try to set them via the menu in the demo above and below")
                .withStylableDevice(new Embed(View1.class).withFullSize(), DeviceType.TABLET_LANDSCAPE)
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new DependencyReader("app-layout-addon").getDependencyString(), "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .withStep("Add App-Layout-Router-Layout Class", "Create a Class that extends AppLayoutRouterLayout and implement the missing methods as shown in the example. The AppLayoutRouterLayout can then be reused in every View by setting it in the Route annotation.",
                        new CodeExample(new CodeExampleFormatter(YourAppLayoutRouterLayout.class.getName()).getCodeExample()
                                , "java", "Java")
                ).withStep("Create a View with a @Route Annotation", "Create a View that contains a @Route Annotation that leads to a specific Path and also has the Class you create above as \"layout=...\". As soon you navigate to the path set in the Annotation this view wrapped by the AppLayout will be visible",
                new CodeExample(new CodeExampleFormatter(com.github.appreciated.collection.demo.applayout.codeexample.View1.class.getName()).getCodeExample(), "java", "Java"),
                new CodeExample(new CodeExampleFormatter(View2.class.getName()).getCodeExample(), "java", "Java")
        );
    }

}
