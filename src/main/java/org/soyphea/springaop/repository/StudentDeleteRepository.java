package org.soyphea.springaop.repository;

import org.soyphea.springaop.doomain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDeleteRepository extends CrudRepository<Student, Long>{

}
