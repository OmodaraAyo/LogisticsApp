package data.repositories.Senders;


import data.models.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Senders extends MongoRepository<Sender, String> {
}
