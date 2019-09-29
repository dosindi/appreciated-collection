package com.github.appreciated.collection.demo.swiper;


import com.github.appreciated.collection.demo.swiper.demo.SwiperExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.entity.GithubDependencies;
import com.github.appreciated.demo.helper.entity.GithubUrl;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Push
@Route("swiper/")
@BodySize(height = "100%", width = "100%")
public class SwiperDemo extends DemoHelperView {

    public SwiperDemo() {
        super(new GithubUrl("https://github.com/appreciated/swiper-flow"), new GithubDependencies("https://github.com/nolimits4web/swiper"));
        withHorizontalHeader("Swiper for flow",
                "A mobile touch slider with hardware accelerated transitions and amazing native behavior.",
                "./frontend/images/swiper/logo.png")
                .withDevice(new TabletView(new SwiperExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("swiper-flow")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add PaperRipple to your View",
                        new CodeExample(SwiperExample.class)
                )
                .withDependencyNotice();
    }
}
