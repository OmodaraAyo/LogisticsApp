package data.repositories.receivers;


import data.models.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Receivers extends MongoRepository<Receiver, String> {
}
