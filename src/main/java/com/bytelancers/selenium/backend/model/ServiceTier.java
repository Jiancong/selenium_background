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
public class ServiceTier {
    private String title;
    private String price;
    private String deliveryTime;
    private int numberOfPages;
    private String numberOfRevisions;
    private boolean responsiveDesign;
    private boolean customAdminPanel;
}
