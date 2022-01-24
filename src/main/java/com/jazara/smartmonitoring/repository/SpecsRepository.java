package com.jazara.smartmonitoring.repository;

import com.jazara.smartmonitoring.domain.Specs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecsRepository extends CrudRepository<Specs, Long> {

}
