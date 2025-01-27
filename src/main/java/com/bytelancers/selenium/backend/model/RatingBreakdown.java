package com.bytelancers.selenium.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RatingBreakdown {
    private double availability;
    private double skills;
    private double deadlines;
    private double communication;
    private double cooperation;

}
