package com.ProjectMyPresent.ProjectMyPresent.model.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "presenttest")
public class Present {
    @Id
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "rating")
    private int rating;

    public Present() {
    }

    public Present(long id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Present{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
