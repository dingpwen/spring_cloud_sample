package com.gome.garbage.model;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecycleRepository extends JpaRepository<Recycle, Long>{
	List<Recycle> findByUserId(Long UserId, Pageable pageable);
}