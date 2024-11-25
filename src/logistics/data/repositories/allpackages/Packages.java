package data.repositories.allpackages;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Packages extends MongoRepository<Package, String> {
}
