package com.tracking.trackingapi;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;

@Service
public class TrackingService {

    private final Set<String> generated = ConcurrentHashMap.newKeySet();

    public String generateTrackingNumber(String origin, String dest, BigDecimal weight,
                                         OffsetDateTime createdAt, UUID customerId,
                                         String customerName, String customerSlug) {

        String base = (origin + dest + customerSlug + createdAt.toEpochSecond()).toUpperCase();
        String tracking = UUID.nameUUIDFromBytes(base.getBytes()).toString().replaceAll("-", "")
                .substring(0, 16).toUpperCase();

        synchronized (this) {
            while (generated.contains(tracking)) {
                tracking = UUID.randomUUID().toString().replaceAll("-", "")
                        .substring(0, 16).toUpperCase();
            }
            generated.add(tracking);
        }

        return tracking;
    }
}
