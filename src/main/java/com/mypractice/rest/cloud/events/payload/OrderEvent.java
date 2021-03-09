package com.mypractice.rest.cloud.events.payload;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OrderEvent {
    private String orderId;
    private String firstName;
    private String email;
    private String lastName;
}
