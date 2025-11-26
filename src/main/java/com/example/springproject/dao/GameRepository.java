package com.example.springproject.dao;

import com.example.springproject.dto.GameDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GameRepository extends JpaRepository<GameDTO, UUID> {
    // plus besoin de méthode car jpa gère tout
}
