package com.dashboard.funds.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.funds.entity.Help;

@Repository
public interface HelpRepository extends CrudRepository<Help, String> {

	

//	select * from teste123 where TOPIC = '@';

//  select * from teste123 where TOPIC = '@' and SEQ = '321';
	ArrayList<Help> findByTOPICAndSEQ(String TOPIC, Double SEQ);
	
}
