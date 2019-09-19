package com.slimani.medicospot.dao;

import com.slimani.medicospot.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstraintRepository extends JpaRepository<Band, Long> {
}
