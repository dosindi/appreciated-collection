package com.github.appreciated.collection.demo.demohelper;

import com.github.appreciated.collection.demo.demohelper.demo.DemoHelperHeaderExample;
import com.github.appreciated.collection.demo.demohelper.demo.DemoHelperOtherExamples;
import com.github.appreciated.collection.demo.demohelper.demo.OtherContent;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.component.browser.RouteBrowser;
import com.github.appreciated.demo.helper.view.devices.LaptopView;
import com.github.appreciated.demo.helper.view.devices.PhoneView;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.demo.helper.view.entity.CssVariable;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.Route;

@Route("demo-helper/")
public class DemoHelperDemoView extends DemoHelperView {

    public DemoHelperDemoView() {
        withVerticalHeader("VerticalHeaderView",
                "I can display a header and an optionally an image or a subtitle",
                "./frontend/images/demohelper/logo.png"
        )
                .withHorizontalHeader("HorizontalHeaderView",
                        "I can display a header and optionally an image or I am suited for longer description texts. Additionally I may contain Components which are display beneath the description that can be used to display f.e. links",
                        "./frontend/images/demohelper/logo.png",
                        new Button("Click Me!")
                )
                .withParagraph("I am a ParagraphView", "I can display a header and a description")
                .withStylableDevice(getDeviceContent("< I'm a StylableDevice I display content and my css variables can be edited beside me >"), new CssVariable("--lumo-primary-text-color"), new CssVariable("--lumo-primary-color"))
                .withStylableDevice(new RouteBrowser(OtherContent.class), new CssVariable("--lumo-primary-text-color"), new CssVariable("--lumo-primary-color"))
                .withThemeableAndStylableDevice(getDeviceContent("< I'm a ThemeableAndStylableDevice my theme can be switch by pressing the switch above. I display content and my css variables can be edited beside me >"), new CssVariable("--lumo-primary-text-color"), new CssVariable("--lumo-primary-color"))
                .withDevices(
                        new TabletView(getDeviceContent("< I belong to a TabletView an display content inside a css rendered tablet >")),
                        new PhoneView(getDeviceContent("< I also belong to a PhoneView an display content inside a css rendered phone >"))
                )
                .withDevice(new PhoneView(
                                getDeviceContent("< I belong to a PhoneView I display content inside a css rendered phone >")),
                        "Also I can show a optional message beside the PhoneView"
                )
                .withImage("I am a ImageParagraphView", "I can display a header, a description and an image", "frontend://images/demohelper/phone.png")
                .withDevice(new TabletView(getDeviceContent("< I belong to a TabletView I display content inside a css rendered tablet >")))
                .withParagraph("I am a ParagraphView",
                        "I display a header and optionally a description. Also you can add components below the description",
                        new Button("Click Me!")
                )
                .withParagraph("I am a ParagraphView without description")
                .withParagraph("I am a ParagraphView without description but with a Component", new Button("Click Me"))
                .withDevice(new LaptopView(getDeviceContent("< I belong to a LaptopView I display content inside a css rendered laptop >")))
                .withStep("I am a StepView",
                        "I display a header step number (1,2,3,4,5) which is automatically generated, also a description and one or multiple code examples",
                        new CodeExample(new AppreciatedDependencyReader("demo-helper-view"))
                )
                .withStep("I am also a StepView",
                        "And I contain a single code example",
                        new CodeExample("clean install", Language.markup, "Maven")
                )
                .withStep("I am also a StepView", "And I contain multiple code examples",
                        new CodeExample(DemoHelperHeaderExample.class),
                        new CodeExample(DemoHelperOtherExamples.class)
                );
    }

    VerticalLayout getDeviceContent(String text) {
        Label label = new Label(text);
        label.setSizeFull();
        VerticalLayout content = new VerticalLayout(label);
        RadioButtonGroup<String> group = new RadioButtonGroup<String>();
        group.setItems("Test");
        content.add(new Button("Test"), group);
        content.setSizeFull();
        return content;
    }

}


