package com.ProjectMyPresent.ProjectMyPresent.model.json;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Question {
    @JsonProperty("id")
    long id;
    @JsonProperty("question")
    String question;
    @JsonProperty("rating")
    int rating;

    public Question() {
    }

    public Question(long id, String question, int rating) {
        this.id = id;
        this.question = question;
        this.rating = rating;
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

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + question + '\'' +
                ", rating=" + rating +
                '}';
    }
}
