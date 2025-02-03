package com.bytelancers.selenium.backend.model.response;

import com.bytelancers.selenium.backend.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileResponse {
    private String name;
    private String location;
    private String localTime;
    private String jobSuccessRate;
    private String title;
    private String description;
    private String hourRate;
    private WorkHistory workHistory;
    private ScriptingAndAutomation scriptingAndAutomation;
    private AllStats allStats;
    private String hoursPerWeek;
    private Map<String, String> languages;
    private Verification verifications;
    private List<ProjectCatalog> projectCatalogs;
    private List<EmploymentHistory> employmentHistories;
    private List<OtherExperience> otherExperiences;
    private List<PortfolioInformation> portfolioInformations;
    private SkillsAndExpertise skillsAndExpertises;
    private PortfolioDetail portfolioDetails;
    private ProjectDetail projectDetails;
}

