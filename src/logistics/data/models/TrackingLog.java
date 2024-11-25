package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("Logs")
public class TrackingLog {

    @Id
    private String id;
    private String description;
    private String trackingNumber;
    private LocalDateTime trackingDate;

}
