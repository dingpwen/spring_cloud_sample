package com.gome.garbage.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
	Token findByToken(String token);
	Token findByUserId(Long userId);
}