package com.ProjectMyPresent.ProjectMyPresent.model.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonQuestion {
    @JsonProperty("id")
    long id;
    @JsonProperty("question")
    String question;
    @JsonProperty("rating")
    int rating;
    @JsonProperty("result")
    int result;

    public JsonQuestion() {
    }

    @JsonCreator
    public JsonQuestion(long id, String question, int rating, int result) {
        this.id = id;
        this.question = question;
        this.rating = rating;
        this.result = result;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", rating=" + rating + ", result=" + result + "]";
    }    
}
