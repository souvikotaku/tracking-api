package com.tracking.trackingapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/next-tracking-number")
public class TrackingNumberController {

    private final TrackingService service;

    public TrackingNumberController(TrackingService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<TrackingNumberResponse> getTrackingNumber(
            @RequestParam String origin_country_id,
            @RequestParam String destination_country_id,
            @RequestParam BigDecimal weight,
            @RequestParam OffsetDateTime created_at,
            @RequestParam UUID customer_id,
            @RequestParam String customer_name,
            @RequestParam String customer_slug) {

        String tracking = service.generateTrackingNumber(origin_country_id, destination_country_id, weight, created_at, customer_id, customer_name, customer_slug);
        return ResponseEntity.ok(new TrackingNumberResponse(tracking, OffsetDateTime.now()));
    }
}
