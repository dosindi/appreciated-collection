package com.github.appreciated.collection.demo.applayout.demo;

import com.github.appreciated.app.layout.behaviour.Behaviour;
import com.github.appreciated.app.layout.builder.AppLayoutBuilder;
import com.github.appreciated.app.layout.component.appbar.AppBarBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftAppMenuBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftSubMenuBuilder;
import com.github.appreciated.app.layout.component.menu.left.items.LeftClickableItem;
import com.github.appreciated.app.layout.component.menu.left.items.LeftHeaderItem;
import com.github.appreciated.app.layout.component.menu.left.items.LeftNavigationItem;
import com.github.appreciated.app.layout.entity.DefaultBadgeHolder;
import com.github.appreciated.app.layout.notification.DefaultNotificationHolder;
import com.github.appreciated.app.layout.notification.component.AppBarNotificationButton;
import com.github.appreciated.app.layout.notification.entitiy.DefaultNotification;
import com.github.appreciated.app.layout.router.AppLayoutRouterLayout;
import com.github.appreciated.collection.demo.applayout.views.View3;
import com.github.appreciated.collection.demo.applayout.views.View4;
import com.github.appreciated.collection.demo.applayout.views.View5;
import com.github.appreciated.collection.demo.applayout.views.View6;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.page.Push;

import static com.github.appreciated.app.layout.entity.Section.FOOTER;
import static com.github.appreciated.app.layout.entity.Section.HEADER;

@Push
public class MyAppLayoutRouterLayout extends AppLayoutRouterLayout {
    /**
     * Do not initialize here. This will lead to NPEs
     */
    private DefaultNotificationHolder notifications;
    private DefaultBadgeHolder badge;


    public MyAppLayoutRouterLayout() {


        notifications = new DefaultNotificationHolder(newStatus -> {
        });
        badge = new DefaultBadgeHolder(5);
        for (int i = 1; i < 6; i++) {
            notifications.addNotification(new DefaultNotification("Test title" + i, "A rather long test description ..............." + i));
        }

        LeftNavigationItem menuEntry = new LeftNavigationItem("Menu", VaadinIcon.MENU.create(), View6.class);
        badge.bind(menuEntry.getBadge());

        init(AppLayoutBuilder
                .get(Behaviour.LEFT_RESPONSIVE_HYBRID)
                .withTitle("App Layout")
                .withAppBar(AppBarBuilder.get()
                        .add(new AppBarNotificationButton<>(VaadinIcon.BELL, notifications))
                        .build())
                .withAppMenu(LeftAppMenuBuilder.get()
                        .addToSection(new LeftHeaderItem("Menu-Header", "APP_LAYOUT_VERSION", "path/to/your/image"), HEADER)
                        .addToSection(new LeftClickableItem("Clickable Entry", VaadinIcon.COG.create(), clickEvent -> Notification.show("onClick ...")), HEADER)
                        .add(new LeftNavigationItem("Home", VaadinIcon.HOME.create(), View1.class))
                        .add(LeftSubMenuBuilder.get("My Submenu", VaadinIcon.PLUS.create())
                                .add(LeftSubMenuBuilder.get("My Submenu", VaadinIcon.PLUS.create())
                                        .add(new LeftNavigationItem("Charts", VaadinIcon.SPLINE_CHART.create(), View2.class))
                                        .add(new LeftNavigationItem("Contact", VaadinIcon.CONNECT.create(), View3.class))
                                        .add(new LeftNavigationItem("More", VaadinIcon.COG.create(), View4.class))
                                        .build())
                                .add(new LeftNavigationItem("Contact1", VaadinIcon.CONNECT.create(), View3.class))
                                .add(new LeftNavigationItem("More1", VaadinIcon.COG.create(), View5.class))
                                .build())
                        .add(menuEntry)
                        .addToSection(new LeftClickableItem("Clickable Entry", VaadinIcon.COG.create(), clickEvent -> Notification.show("onClick ...")), FOOTER)
                        .build())
                .build());
    }

}


