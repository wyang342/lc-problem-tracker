package com.example.lcproblemtracker;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Problem {
    private enum Difficulty {
        EASY, MEDIUM, HARD
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String[] patterns;

    private String link;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private String timeComplexity;

    private String spaceComplexity;

    private String notes;

    private Date lastSolved;

    private int minutesSpent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String[] getPatterns() {
        return patterns;
    }

    public void setPatterns(String[] patterns) {
        this.patterns = patterns;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getTimeComplexity() {
        return timeComplexity;
    }

    public void setTimeComplexity(String timeComplexity) {
        this.timeComplexity = timeComplexity;
    }

    public String getSpaceComplexity() {
        return spaceComplexity;
    }

    public void setSpaceComplexity(String spaceComplexity) {
        this.spaceComplexity = spaceComplexity;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getLastSolved() {
        return lastSolved;
    }

    public void setLastSolved(Date lastSolved) {
        this.lastSolved = lastSolved;
    }

    public int getMinutesSpent() {
        return minutesSpent;
    }

    public void setMinutesSpent(int minutesSpent) {
        this.minutesSpent = minutesSpent;
    }
}
