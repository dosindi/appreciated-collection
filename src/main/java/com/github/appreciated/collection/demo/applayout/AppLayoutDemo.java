package com.github.appreciated.collection.demo.applayout;


import com.github.appreciated.collection.component.Embed;
import com.github.appreciated.collection.demo.applayout.views.View1;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.PhoneView;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("app-layout/")
@BodySize(height = "100%", width = "100%")
public class AppLayoutDemo extends VerticalLayout {

    public AppLayoutDemo() {
        add(new DemoHelperView()
                .withHorizontalHeader("AppLayout", "A responsive layout that allows you to create modern Menus quickly", "./frontend/images/no-logo.png")
                .withDeviceParagraph(new PhoneView(new Embed(View1.class)), "Optimized for small screens")
                .withParagraph("Behaviours", "The AppLayout has by default multiple Behaviours availabe. Try to set them via the menu in the demo above and below")
                .withDevice(new TabletView(new Embed(View1.class)))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("<dependency>\n" +
                                "    <groupId>com.github.appreciated</groupId>\n" +
                                "    <artifactId>card</artifactId>\n" +
                                "    <version>0.7.0</version>\n" +
                                "</dependency>", "xml", "Maven"))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("install", "xml", "Maven")
                )
                .withStep("Code Example", "Add the Code to create the AppLayout to your UI. Use the Builder to create the AppLayout with less code.",
                        new CodeExample("public class MainAppLayout extends AppLayoutRouterLayout {\n" +
                                "    /**\n" +
                                "     * Do not initialize here. This will lead to NPEs\n" +
                                "     */\n" +
                                "    private DefaultNotificationHolder notifications;\n" +
                                "    private DefaultBadgeHolder badge;\n" +
                                "\n" +
                                "    @Override\n" +
                                "    public AppLayout createAppLayoutInstance() {\n" +
                                "        notifications = new DefaultNotificationHolder(newStatus -> {\n" +
                                "        });\n" +
                                "        badge = new DefaultBadgeHolder(5);\n" +
                                "\n" +
                                "        LeftNavigationComponent menuEntry = new LeftNavigationComponent(\"Menu\", VaadinIcon.MENU.create(), View6.class);\n" +
                                "        badge.bind(menuEntry.getBadge());\n" +
                                "\n" +
                                "        return AppLayoutBuilder\n" +
                                "                .get(Behaviour.LEFT_RESPONSIVE)\n" +
                                "                .withTitle(\"App Layout\")\n" +
                                "                .withAppBar(AppBarBuilder\n" +
                                "                        .get()\n" +
                                "                        .add(new AppBarNotificationButton(VaadinIcon.BELL, notifications))\n" +
                                "                        .build())\n" +
                                "                .withAppMenu(LeftAppMenuBuilder\n" +
                                "                        .get()\n" +
                                "                        .addToSection(new MenuHeaderComponent(\"Menu-Header\",\n" +
                                "                                \"Version 2.0.4\",\n" +
                                "                                \"/frontend/images/logo.png\"\n" +
                                "                        ), HEADER)\n" +
                                "                        .addToSection(new LeftClickableComponent(\"Clickable Entry\",\n" +
                                "                                VaadinIcon.COG.create(),\n" +
                                "                                clickEvent -> Notification.show(\"onClick ...\")\n" +
                                "                        ), HEADER)\n" +
                                "                        .add(new LeftNavigationComponent(\"Home\", VaadinIcon.HOME.create(), View1.class))\n" +
                                "                        .add(new LeftNavigationComponent(\"Grid\", VaadinIcon.TABLE.create(), GridTest.class))\n" +
                                "                        .add(LeftSubMenuBuilder\n" +
                                "                                .get(\"My Submenu\", VaadinIcon.PLUS.create())\n" +
                                "                                .add(LeftSubMenuBuilder\n" +
                                "                                        .get(\"My Submenu\", VaadinIcon.PLUS.create())\n" +
                                "                                        .add(new LeftNavigationComponent(\"Charts\",\n" +
                                "                                                VaadinIcon.SPLINE_CHART.create(),\n" +
                                "                                                View2.class\n" +
                                "                                        ))\n" +
                                "                                        .add(new LeftNavigationComponent(\"Contact\",\n" +
                                "                                                VaadinIcon.CONNECT.create(),\n" +
                                "                                                View3.class\n" +
                                "                                        ))\n" +
                                "                                        .add(new LeftNavigationComponent(\"More\",\n" +
                                "                                                VaadinIcon.COG.create(),\n" +
                                "                                                View4.class\n" +
                                "                                        ))\n" +
                                "                                        .build())\n" +
                                "                                .add(new LeftNavigationComponent(\"Contact1\",\n" +
                                "                                        VaadinIcon.CONNECT.create(),\n" +
                                "                                        View3.class\n" +
                                "                                ))\n" +
                                "                                .add(new LeftNavigationComponent(\"More1\", VaadinIcon.COG.create(), View5.class))\n" +
                                "                                .build())\n" +
                                "                        .add(menuEntry)\n" +
                                "                        .addToSection(new LeftClickableComponent(\"Clickable Entry\",\n" +
                                "                                VaadinIcon.COG.create(),\n" +
                                "                                clickEvent -> Notification.show(\"onClick ...\")\n" +
                                "                        ), FOOTER)\n" +
                                "                        .build())\n" +
                                "                .build();\n" +
                                "    }\n" +
                                "}", "java", "Java")
                )
        );
    }

}
