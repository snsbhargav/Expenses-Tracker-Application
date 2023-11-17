package com.project.expensesTrackerBacked.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.expensesTrackerBacked.Entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
