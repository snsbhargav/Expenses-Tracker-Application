package com.project.expensesTrackerBackend.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.expensesTrackerBackend.Entity.ExpensesEntity;

@Repository
public interface ExpensesRepository extends JpaRepository<ExpensesEntity, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM EXPENSES_ENTITY WHERE FK_USER_ID=?")
	List<ExpensesEntity> findByUserId(Long userId);
}
