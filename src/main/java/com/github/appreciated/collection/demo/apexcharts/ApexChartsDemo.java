package com.github.appreciated.collection.demo.apexcharts;


import com.github.appreciated.collection.demo.apexcharts.demo.ApexChartsExample;
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

@Route("apexcharts/")
@BodySize(height = "100%", width = "100%")
public class ApexChartsDemo extends DemoHelperView {

    public ApexChartsDemo() {
        super(new GithubUrl("https://github.com/appreciated/apexcharts"), new GithubDependencies("https://github.com/apexcharts/apexcharts.js"));
        withHorizontalHeader("ApexCharts.js",
                "A modern JavaScript charting library to build interactive charts and visualizations with simple API.",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(new ApexChartsExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("apexcharts")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add ApexCharts.js to your View",
                        new CodeExample(ApexChartsExample.class)
                )
                .withDependencyNotice();
    }
}
