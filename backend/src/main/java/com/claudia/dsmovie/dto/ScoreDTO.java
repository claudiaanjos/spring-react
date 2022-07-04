package com.claudia.dsmovie.dto;

public class ScoreDTO {
    private Long movieId;
    private String email;
    private Double score;

    public ScoreDTO(){}

    public void setMovieID(Long movieId){
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScore() {
        return score;
    }
}
