package data.models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Package {

    private String id;
    private Receiver receiver;
    private List<TrackingLog> trackingLogList = new ArrayList<>();
    private String description;
    private LocalDateTime createdAt;
    private Sender sender;
    private long deliveryFee;
    private int quantity;

}
