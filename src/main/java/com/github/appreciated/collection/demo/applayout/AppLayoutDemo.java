package com.github.appreciated.collection.demo.applayout;


import com.github.appreciated.collection.component.Embed;
import com.github.appreciated.collection.demo.applayout.views.View1;
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
                        new CodeExample("<dependency>\n" +
                                "    <groupId>com.github.appreciated</groupId>\n" +
                                "    <artifactId>app-layout-addon</artifactId>\n" +
                                "    <version>2.0.5</version>\n" +
                                "</dependency>", "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .withStep("Add App-Layout-Router-Layout Class", "Create a RouterLayout that extends AppLayoutRouterLayout. Initalize here the AppLayout, the RouterLayout can then be reused in every View",
                        new CodeExample("@Push\n" +
                                "@Viewport(\"width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes\")\n" +
                                "public class MainAppLayout extends AppLayoutRouterLayout {\n" +
                                "    /**\n" +
                                "     * Do not initialize here. This will lead to NPEs\n" +
                                "     */\n" +
                                "    private DefaultNotificationHolder notifications;\n" +
                                "    private DefaultBadgeHolder badge;\n" +
                                "\n" +
                                "    @Override\n" +
                                "    public AppLayout createAppLayoutInstance() {\n" +
                                "        notifications = new DefaultNotificationHolder(newStatus -> {});\n" +
                                "        badge = new DefaultBadgeHolder(5);\n" +
                                "\n" +
                                "        LeftNavigationComponent menuEntry = new LeftNavigationComponent(\"Menu\", VaadinIcon.MENU.create(), View6.class);\n" +
                                "        badge.bind(menuEntry.getBadge());\n" +
                                "\n" +
                                "        return AppLayoutBuilder\n" +
                                "                .get(Behaviour.LEFT_RESPONSIVE_HYBRID)\n" +
                                "                .withTitle(\"App Layout\")\n" +
                                "                .withAppBar(AppBarBuilder.get()\n" +
                                "                        .add(new AppBarNotificationButton(VaadinIcon.BELL, notifications))\n" +
                                "                        .build())\n" +
                                "                .withAppMenu(LeftAppMenuBuilder.get()\n" +
                                "                        .addToSection(new MenuHeaderComponent(\"Menu-Header\", \"Version 2.0.5\", \"./frontend/images/applayout/app-layout-logo.png\"), HEADER)\n" +
                                "                        .addToSection(new LeftClickableComponent(\"Clickable Entry\", VaadinIcon.COG.create(), clickEvent -> Notification.show(\"onClick ...\")), HEADER)\n" +
                                "                        .add(new LeftNavigationComponent(\"Home\", VaadinIcon.HOME.create(), View1.class))\n" +
                                "                        .add(new LeftNavigationComponent(\"Grid\", VaadinIcon.TABLE.create(), GridTest.class))\n" +
                                "                        .add(LeftSubMenuBuilder.get(\"My Submenu\", VaadinIcon.PLUS.create())\n" +
                                "                                .add(LeftSubMenuBuilder.get(\"My Submenu\", VaadinIcon.PLUS.create())\n" +
                                "                                        .add(new LeftNavigationComponent(\"Charts\", VaadinIcon.SPLINE_CHART.create(), View2.class))\n" +
                                "                                        .add(new LeftNavigationComponent(\"Contact\", VaadinIcon.CONNECT.create(), View3.class))\n" +
                                "                                        .add(new LeftNavigationComponent(\"More\", VaadinIcon.COG.create(), View4.class))\n" +
                                "                                        .build())\n" +
                                "                                .add(new LeftNavigationComponent(\"Contact1\", VaadinIcon.CONNECT.create(), View3.class))\n" +
                                "                                .add(new LeftNavigationComponent(\"More1\", VaadinIcon.COG.create(), View5.class))\n" +
                                "                                .build())\n" +
                                "                        .add(menuEntry)\n" +
                                "                        .addToSection(new LeftClickableComponent(\"Clickable Entry\", VaadinIcon.COG.create(), clickEvent -> Notification.show(\"onClick ...\")), FOOTER)\n" +
                                "                        .build())\n" +
                                "                .build();\n" +
                                "    }\n" +
                                "}", "java", "Java")
                ).withStep("Create a View with a @Route Annotation", "Create a View that contains a @Route Annotation that leads to a specific Path. As soon you navigate to this path the App Layout will be visible",
                new CodeExample("@Route(value = \"\", layout = MainAppLayout.class)\n" +
                        "public class View1 extends VerticalLayout {\n" +
                        "\n" +
                        "    public View1() {\n" +
                        "    }\n" +
                        "\n" +
                        "}", "java", "Java")
        );
    }

}
