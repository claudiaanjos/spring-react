package com.claudia.dsmovie.dto;

import com.claudia.dsmovie.entities.Movie;

public class MovieDTO {
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO(){}

    public MovieDTO(Long id, String title, Double score, Integer count, String image){
        this.id = id;
        this.title = title;
        this.count = count;
        this.image = image;
    }

    public MovieDTO(Movie movie){
        id = movie.getId();
        title = movie.getTitle();
        count = movie.getCount();
        image = movie.getImage();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    
}
