package com.github.appreciated.collection.demo.prismelement.demo;

import com.github.appreciated.prism.element.Language;
import com.github.appreciated.prism.element.PrismHighlighter;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class PrismHighlighterExample extends VerticalLayout {
    public PrismHighlighterExample() {
        PrismHighlighter javaCode = new PrismHighlighter("String a = \"Test1234\";\n" +
                "String b = \"Test1234\";\n" +
                "String c = \"Test1234\";\n" +
                "String d = \"Test1234\";", Language.java);

        PrismHighlighter xml = new PrismHighlighter("<dependency>\n" +
                "    <groupId>com.github.appreciated</groupId>\n" +
                "    <artifactId>prism-element</artifactId>\n" +
                "    <version>LATEST</version>\n" +
                "</dependency>", Language.markup);

        add(new Label("Java Highlighting"), javaCode, new Label("XML Highlighting"), xml);
    }
}
