package repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import models.Employee;
import reactor.core.publisher.Mono;

@Repository
public interface EmployeeRepo extends ReactiveMongoRepository<Employee,String> {

	

	
}
