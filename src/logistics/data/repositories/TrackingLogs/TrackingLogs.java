package data.repositories.TrackingLogs;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingLogs extends MongoRepository<TrackingLogs, String> {
}
