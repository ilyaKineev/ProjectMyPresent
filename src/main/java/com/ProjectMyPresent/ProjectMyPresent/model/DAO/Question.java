package com.ProjectMyPresent.ProjectMyPresent.model.DAO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questiontest")
public class Question {
    @Id
    private long id;
    @Column(name = "question")
    private String question;
    @Column(name = "rating")
    private int rating;

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

    public String getQuestion() {
        return question;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", rating=" + rating +
                '}';
    }
}
