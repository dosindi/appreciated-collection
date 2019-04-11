package com.github.appreciated.collection.demo.apexcharts.demo;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.PlotOptionsBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.plotoptions.builder.HollowBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.builder.RadialBarBuilder;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class RadialBarChartExample extends VerticalLayout {
    public RadialBarChartExample() {
        ApexCharts radialBarChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.radialBar)
                        .build())
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withRadialBar(RadialBarBuilder.get()
                                .withHollow(HollowBuilder.get()
                                        .withSize("70%")
                                        .build())
                                .build())
                        .build())
                .withSeries(70.0)
                .withLabels("Circket");
        radialBarChart.setWidth("550px");
        radialBarChart.setHeight("350px");
        add(radialBarChart);
    }
}
