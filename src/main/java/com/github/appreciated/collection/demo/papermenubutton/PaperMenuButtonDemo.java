package com.github.appreciated.collection.demo.papermenubutton;


import com.github.appreciated.collection.demo.papermenubutton.demo.PaperMenuButtonExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.entity.GithubDependencies;
import com.github.appreciated.demo.helper.entity.GithubUrl;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-menu-button/")
@BodySize(height = "100%", width = "100%")
public class PaperMenuButtonDemo extends DemoHelperView {

    public PaperMenuButtonDemo() {
        super(new GithubUrl("https://github.com/appreciated/vaadin-paper-menu-button"), new GithubDependencies("https://github.com/PolymerElements/paper-menu-button"));
        withHorizontalHeader("PaperMenuButton",
                "Allows to open a popup on the click of a trigger Component. Similar to the PopupView",
                "./frontend/images/menubutton/logo.png")
                .withDevice(new TabletView(new PaperMenuButtonExample()).withOrientation(Orientation.PORTRAIT), "Some  examples")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("vaadin-paper-menu-button")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add a PaperMenuButton to your View",
                        new CodeExample(PaperMenuButtonExample.class)
                ).withDependencyNotice();
    }

}
