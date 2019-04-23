package com.github.appreciated.collection.demo.apexcharts.demo;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.TitleSubtitleBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class RadarChartExample extends VerticalLayout {
    public RadarChartExample() {
        ApexCharts radarChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.radar)
                        .build())
                .withSeries(new Series("Series 1", 80, 50, 30, 40, 100, 20))
                .withTitle(TitleSubtitleBuilder.get()
                        .withText("Basic Radar Chart")
                        .build())
                .withLabels("January", "February", "March", "April", "May", "June");
        add(radarChart);
    }
}
