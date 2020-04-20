package com.gome.garbage.model;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends JpaRepository<Point, Long>{
	List<Point> findByUserId(Long UserId, Pageable pageable);
}