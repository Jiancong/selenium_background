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
public class ProjectDetail {
    private String title;
    private String rate;
    private String count;
    private List<String> images;
    private String details;
    private String deliveryTime;
    private String numberOfRevisions;
    private int pages;
    private boolean customAdminPanel;
    private List<String> programmingLanguages;
    private List<String> codingExpertise;
    private List<ServiceTier> serviceTiers;
    private List<PortfolioLink> portfolioLinks;
    private List<FrequentlyAskedQuestion> frequentlyAskedQuestions;
    private Reviews reviews;
}
