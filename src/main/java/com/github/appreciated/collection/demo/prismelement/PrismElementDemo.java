package com.github.appreciated.collection.demo.prismelement;


import com.github.appreciated.collection.maven.DependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.prism.element.PrismHighlighter;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("prism-element/")
@BodySize(height = "100%", width = "100%")
public class PrismElementDemo extends DemoHelperView {

    public PrismElementDemo() {
        withHorizontalHeader("Prism Element",
                "Provides code/syntax highlighting by using prism",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(getExample()).withOrientation(Orientation.PORTRAIT), "Some highlighting examples")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new DependencyReader("prism-element").getDependencyString(), "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add Paper Color to your View",
                        new CodeExample("PrismHighlighter javaCode = new PrismHighlighter(\"String a = \\\"Test1234\\\";\\n\" +\n" +
                                "        \"String b = \\\"Test1234\\\";\\n\" +\n" +
                                "        \"String c = \\\"Test1234\\\";\\n\" +\n" +
                                "        \"String d = \\\"Test1234\\\";\", \"java\");\n" +
                                "PrismHighlighter xmlCode = new PrismHighlighter(\"<dependency>\\n\" +\n" +
                                "        \"    <groupId>com.github.appreciated</groupId>\\n\" +\n" +
                                "        \"    <artifactId>prism-element</artifactId>\\n\" +\n" +
                                "        \"    <version>0.5</version>\\n\" +\n" +
                                "        \"</dependency>\", \"xml\");", "java", "Java")
                );
    }

    private Component getExample() {
        PrismHighlighter javaCode = new PrismHighlighter("String a = \"Test1234\";\n" +
                "String b = \"Test1234\";\n" +
                "String c = \"Test1234\";\n" +
                "String d = \"Test1234\";", "java");
        PrismHighlighter xmlCode = new PrismHighlighter("<dependency>\n" +
                "    <groupId>com.github.appreciated</groupId>\n" +
                "    <artifactId>prism-element</artifactId>\n" +
                "    <version>0.5</version>\n" +
                "</dependency>", "xml");
        return new VerticalLayout(new Label("Java Highlighting"), javaCode, new Label("XML Highlighting"), xmlCode);
    }
}
