package com.github.appreciated.collection.demo.apexcharts;


import com.github.appreciated.collection.demo.apexcharts.demo.*;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.entity.GithubDependencies;
import com.github.appreciated.demo.helper.entity.GithubUrl;
import com.github.appreciated.demo.helper.view.devices.IPadMiniView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

import static com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode.CENTER;

@Push
@Route("apexcharts/")
@BodySize(height = "100%", width = "100%")
public class ApexChartsDemo extends DemoHelperView {

    public ApexChartsDemo() {
        super(new GithubUrl("https://github.com/appreciated/apexcharts-flow"), new GithubDependencies("https://github.com/apexcharts/apexcharts.js", "https://github.com/One-com/one-color"));
        withHorizontalHeader("ApexCharts.js",
                "A modern JavaScript charting library to build interactive charts and visualizations with simple API.",
                "./frontend/images/no-logo.png")
                .withDevice(new IPadMiniView(new ApexChartsExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("apexcharts")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven"))
                .withCodeExample(wrap(new AreaChartExample()), new CodeExample(AreaChartExample.class))
                .withCodeExample(wrap(new CandleStickChartExample()), new CodeExample(CandleStickChartExample.class))
                .withCodeExample(wrap(new DonutChartExample()), new CodeExample(DonutChartExample.class))
                .withCodeExample(wrap(new HorizontalBarChartExample()), new CodeExample(HorizontalBarChartExample.class))
                .withCodeExample(wrap(new VerticalBarChartExample()), new CodeExample(VerticalBarChartExample.class))
                .withCodeExample(wrap(new LineChartExample()), new CodeExample(LineChartExample.class))
                .withCodeExample(wrap(new PieChartExample()), new CodeExample(PieChartExample.class))
                .withCodeExample(wrap(new RadarChartExample()), new CodeExample(RadarChartExample.class))
                .withCodeExample(wrap(new RadialBarChartExample()), new CodeExample(RadialBarChartExample.class))
                .withCodeExample(wrap(new MultiRadialBarChartExample()), new CodeExample(MultiRadialBarChartExample.class))
                .withCodeExample(wrap(new GradientRadialBarChartExample()), new CodeExample(GradientRadialBarChartExample.class))
                .withCodeExample(wrap(new ScatterChartExample()), new CodeExample(ScatterChartExample.class))
                .withCodeExample(wrap(new HeatmapChartExample()), new CodeExample(HeatmapChartExample.class))
                .withCodeExample(wrap(new BubbleChartExample()), new CodeExample(BubbleChartExample.class))
                .withDependencyNotice();
    }

    private HorizontalLayout wrap(Component chart) {
        HorizontalLayout hl = new HorizontalLayout(chart);
        hl.setWidth("500px");
        HorizontalLayout wrapper = new HorizontalLayout(hl);
        wrapper.setJustifyContentMode(CENTER);
        wrapper.setWidthFull();
        return wrapper;
    }
}
