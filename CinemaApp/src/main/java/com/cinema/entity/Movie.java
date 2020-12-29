package com.cinema.entity;

import com.cinema.enums.MovieState;
import com.cinema.enums.MovieType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class Movie extends BaseEntity{



    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private MovieType type;

    @Enumerated(EnumType.STRING)
    private MovieState state;

    @Column(columnDefinition = "Date")
    private LocalDate release_date;

    private Integer duriation;

    @Column(columnDefinition = "text")
    private String summary;


    @ManyToMany
    @JoinTable(name = "movie_genre_rel", joinColumns = @JoinColumn(name = "movie_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList = new ArrayList<>();

    public Movie(String name, BigDecimal price, MovieType type, MovieState state, LocalDate release_date, Integer duriation, String summary) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.state = state;
        this.release_date = release_date;
        this.duriation = duriation;
        this.summary = summary;
    }
}
