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
public class Reviews {
    private int count;
    private double averageRating;
    private RatingBreakdown ratingBreakdown;
    private List<ClientReview> reviews;
}
