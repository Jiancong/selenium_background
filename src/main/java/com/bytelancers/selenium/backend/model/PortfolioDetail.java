package com.bytelancers.selenium.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioDetail {
    private String title;
    private String details;
    private List<String> tags;
    private List<String> links;
    private String freelancerName;

}
