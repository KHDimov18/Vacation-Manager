package com.example.servingwebcontent.models;

public class Project {
    private String projectName, description, teamsWorkingOnProject;

    public Project(String projectName, String description, String teamsWorkingOnProject) {
        this.projectName = projectName;
        this.description = description;
        this.teamsWorkingOnProject = teamsWorkingOnProject;
    }

    public Project() {}

    @Override
    public String toString() {
        return String.format(
                "Project[projectName=%s, description='%s', teamsWorkingOnProject='%s']",
                projectName, description, teamsWorkingOnProject);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeamsWorkingOnProject() {
        return teamsWorkingOnProject;
    }

    public void setTeamsWorkingOnProject(String teamsWorkingOnProject) {
        this.teamsWorkingOnProject = teamsWorkingOnProject;
    }
}
