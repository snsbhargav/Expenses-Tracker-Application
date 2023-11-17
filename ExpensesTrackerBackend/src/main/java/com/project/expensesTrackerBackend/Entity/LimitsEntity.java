package com.project.expensesTrackerBackend.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class LimitsEntity {

	//Food, Bills, Entertainment
	@Id
	private Long limitId;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private UserEntity user;
	private Long limitForFood;
	private Long limitForBills;
	private Long limitForEntertainment;
}
