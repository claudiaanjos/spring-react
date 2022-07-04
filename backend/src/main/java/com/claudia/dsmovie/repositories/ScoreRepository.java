package com.claudia.dsmovie.repositories;

import com.claudia.dsmovie.entities.Score;
import com.claudia.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
    
}
