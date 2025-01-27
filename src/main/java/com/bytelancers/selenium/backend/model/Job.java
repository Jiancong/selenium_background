package com.bytelancers.selenium.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    private String title;
    private int rank;
    private int range;
    private Feedback feedback;
    private String earnings;
    private String jobType;

}
