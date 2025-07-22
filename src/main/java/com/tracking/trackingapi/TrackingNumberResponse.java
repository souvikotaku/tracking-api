package com.tracking.trackingapi;

import java.time.OffsetDateTime;

public class TrackingNumberResponse {
    private String tracking_number;
    private OffsetDateTime created_at;

    public TrackingNumberResponse(String trackingNumber, OffsetDateTime createdAt) {
        this.tracking_number = trackingNumber;
        this.created_at = createdAt;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public OffsetDateTime getCreated_at() {
        return created_at;
    }
}
