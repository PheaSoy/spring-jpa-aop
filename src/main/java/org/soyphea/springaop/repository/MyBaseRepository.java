package org.soyphea.springaop.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
interface MyBaseRepository <T,ID extends  Serializable> extends Repository<T, ID>{
	
	Optional<T> findById(ID id);
	<S extends T> S save(S enitity);
	
}
