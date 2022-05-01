package com.dashboard.funds.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.funds.entity.Fund;

@Repository
public interface FundRepository extends CrudRepository<Fund, String> {

	Fund findByTicker(String ticker);
}
