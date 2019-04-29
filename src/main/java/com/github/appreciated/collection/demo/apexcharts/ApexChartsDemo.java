package com.github.appreciated.collection.demo.apexcharts;


import com.github.appreciated.collection.demo.apexcharts.demo.*;
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
        super(new GithubUrl("https://github.com/appreciated/apexcharts-flow"), new GithubDependencies("https://github.com/apexcharts/apexcharts.js"));
        withHorizontalHeader("ApexCharts.js",
                "A modern JavaScript charting library to build interactive charts and visualizations with simple API.",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(new ApexChartsExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("apexcharts")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven"))
                .resetCounterStep()
                .withStep("Area Chart code example", "This is how you add a Area Chart to your View",
                        new CodeExample(AreaChartExample.class))
                .withStep("Candle Stick Chart code example", "This is how you add a Candle Stick Chart to your View",
                        new CodeExample(CandleStickChartExample.class))
                .withStep("Donut Chart code example", "This is how you add a Donut Chart to your View",
                        new CodeExample(DonutChartExample.class))
                .withStep("Horizontal Bar Chart code example", "This is how you add a Horizontal Bar Chart to your View",
                        new CodeExample(HorizontalBarChartExample.class))
                .withStep("Vertical Bar Chart code example", "This is how you add a hertical Bar Chart to your View",
                        new CodeExample(VerticalBarChartExample.class))
                .withStep("Line Chart code example", "This is how you add a Line Chart to your View",
                        new CodeExample(LineChartExample.class))
                .withStep("Pie Chart code example", "This is how you add a Pie Chart to your View",
                        new CodeExample(PieChartExample.class))
                .withStep("Radar Chart code example", "This is how you add a Radar Chart to your View",
                        new CodeExample(RadarChartExample.class))
                .withStep("Radial Bar Chart code example", "This is how you add a Radial Bar Chart to your View",
                        new CodeExample(RadialBarChartExample.class))
                .withStep("Multi Radial Bar Chart code example", "This is how you add a Multi Radial Bar Chart to your View",
                        new CodeExample(MultiRadialBarChartExample.class))
                .withStep("Radial Gradient Bar Chart code example", "This is how you add a Radial Gradient Bar Chart to your View",
                        new CodeExample(GradientRadialBarChartExample.class))
                .withStep("Scatter Chart code example", "This is how you add a Scatter Chart to your View",
                        new CodeExample(ScatterChartExample.class))
                .withStep("Heatmap Chart code example", "This is how you add a Heatmap Chart to your View",
                        new CodeExample(HeatmapChartExample.class))
                .withStep("Bubble Chart code example", "This is how you add a Bubble Chart to your View",
                        new CodeExample(BubbleChartExample.class))
                .withDependencyNotice();
    }
}
