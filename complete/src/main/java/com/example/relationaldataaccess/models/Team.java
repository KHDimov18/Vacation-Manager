package com.example.servingwebcontent.models;

public class Team {
    private String teamName, projectInProgress, developers, teamLeader;

    public Team(String teamName, String projectInProgress, String developers, String teamLeader) {
        this.teamName = teamName;
        this.projectInProgress = projectInProgress;
        this.developers = developers;
        this.teamLeader = teamLeader;
    }

    public Team() {}

    @Override
    public String toString() {
        return String.format(
                "Team[teamName=%s, projectInProgress='%s', developers='%s', teamLeader='%s']",
                teamName, projectInProgress, developers, teamLeader);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getProjectInProgress() {
        return projectInProgress;
    }

    public void setProjectInProgress(String projectInProgress) {
        this.projectInProgress = projectInProgress;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader;
    }

}
