package com.ProjectMyPresent.ProjectMyPresent.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Present {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("questionList")
    private List<Boolean> questionList;
    @JsonProperty("value")
    double value;

    public Present(Long id, String name, List<Boolean> questionList) {
        this.id = id;
        this.name = name;
        this.questionList = questionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Boolean> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Boolean> questionList) {
        this.questionList = questionList;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }  
}
