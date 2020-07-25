package org.techhub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techhub.dto.Register;

@Repository("registerRepository")
public interface RegisterRepository extends CrudRepository<Register,Integer>{

}
