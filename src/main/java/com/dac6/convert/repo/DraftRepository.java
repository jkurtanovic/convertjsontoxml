package com.dac6.convert.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac6.convert.json.model.Fintdac6Draft;

@Repository
public interface DraftRepository extends JpaRepository<Fintdac6Draft, Long> {
	 
}
