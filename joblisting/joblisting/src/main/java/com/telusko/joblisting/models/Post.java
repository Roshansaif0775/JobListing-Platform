package com.telusko.joblisting.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "JobPost")
public class Post {
    private String id;
    private String jobId;
    private String jobTitle;
    private String company;
    private String location;
    private int salary;
    private String jobType;
    private String postedDate;
    private String description;
    private List<String> skills;
    private String experienceLevel;
    private String applyLink;

    // Constructors
    public Post() {

    }

    public Post(String id, String jobId, String jobTitle, String company, String location, int salary, String jobType,
               String postedDate, String description, List<String> skills, String experienceLevel, String applyLink) {
        this.id = id;
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.jobType = jobType;
        this.postedDate = postedDate;
        this.description = description;
        this.skills = skills;
        this.experienceLevel = experienceLevel;
        this.applyLink = applyLink;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public String getApplyLink() {
        return applyLink;
    }

    public void setApplyLink(String applyLink) {
        this.applyLink = applyLink;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", jobId='" + jobId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", jobType='" + jobType + '\'' +
                ", postedDate='" + postedDate + '\'' +
                ", description='" + description + '\'' +
                ", skills=" + skills +
                ", experienceLevel='" + experienceLevel + '\'' +
                ", applyLink='" + applyLink + '\'' +
                '}';
    }
}
