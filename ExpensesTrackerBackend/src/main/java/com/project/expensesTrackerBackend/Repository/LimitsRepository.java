package com.project.expensesTrackerBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.expensesTrackerBackend.Entity.LimitsEntity;
import com.project.expensesTrackerBackend.Entity.UserEntity;

@Repository
public interface LimitsRepository extends JpaRepository<LimitsEntity, Long>{

}
