package com.slimani.medicospot.dao;

import com.slimani.medicospot.model.Worktime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorktimeRepository extends JpaRepository<Worktime, Long> {
}
