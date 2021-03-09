package com.mypractice.rest.cloud.events.event;

import lombok.*;

import java.time.LocalDateTime;
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MessageEvent<K, T> {
    private K key;
    private T data;
    private EventType eventType;//need to be dynamic
    private LocalDateTime eventCreatedAt;
}
