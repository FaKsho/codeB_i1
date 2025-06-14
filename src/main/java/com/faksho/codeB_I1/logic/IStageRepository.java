package com.faksho.codeB_I1.logic;

import com.faksho.codeB_I1.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStageRepository extends JpaRepository<Stage, Long> {
}
