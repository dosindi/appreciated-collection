package com.github.appreciated.collection.demo.progressbarjs.demo;

import com.github.appreciated.ProgressCircle;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CircleProgressbarExample extends VerticalLayout {
    public CircleProgressbarExample() {

        ProgressCircle circle1 = new ProgressCircle();
        ProgressCircle circle2 = new ProgressCircle();
        ProgressCircle circle3 = new ProgressCircle();
        ProgressCircle circle4 = new ProgressCircle();
        ProgressCircle circle5 = new ProgressCircle();
        // Set the size of the progress circle
        circle1.setWidth("150px");
        circle2.setWidth("150px");
        circle3.setWidth("150px");
        circle4.setWidth("150px");
        circle5.setWidth("150px");

        circle1.setHeight("150px");
        circle2.setHeight("150px");
        circle3.setHeight("150px");
        circle4.setHeight("150px");
        circle5.setHeight("150px");

        // Circle 1
        circle1.setProgress(0);  // set the progress of the circle
        // Circle 2
        circle2.setProgress(0.25);
        circle2.setStrokeWidth(4); // set the width of the progressbar
        circle2.setTrailWidth(7); // set the width of the trail
        // Circle 3
        circle3.setFromColor("#f00"); // set the color on 0 percent
        circle3.setToColor("#0f0"); // set the color ar 100%
        circle3.setProgress(0.50); // will result in a number in between the two values above
        // Circle 4
        circle4.setProgress(0.75);
        circle4.setDrawNumber(true); // Draw the progress number
        circle4.setNumberSuffix("%"); // add % as suffix to the numbber
        circle4.setNumberPrefix("+"); // add + as prefix to the numbber
        circle4.setRoundStroke(false); // set a cornered stroke
        // Circle 5
        circle5.setProgress(1.0);
        circle5.setFromStrokeWidth(0.5);  // set the stroke width on 0 percent
        circle5.setToStrokeWidth(3.0); // set the stroke width on 100% percent

        setAlignItems(Alignment.CENTER);
        add(circle1, circle2, circle3, circle4, circle5);

        setSpacing(false);
    }
}
