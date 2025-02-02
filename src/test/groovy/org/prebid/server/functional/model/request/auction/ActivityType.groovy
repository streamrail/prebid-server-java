package org.prebid.server.functional.model.request.auction

import com.fasterxml.jackson.annotation.JsonValue

enum ActivityType {

    SYNC_USER("syncUser"),
    FETCH_BIDS("fetchBids"),
    ENRICH_UFPD("enrichUfpd"),
    REPORT_ANALYTICS("reportAnalytics"),
    TRANSMIT_UFPD("transmitUfpd"),
    TRANSMIT_PRECISE_GEO("transmitPreciseGeo")

    @JsonValue
    final String value

    ActivityType(String value) {
        this.value = value
    }

    String getMetricValue() {
        name().toLowerCase()
    }
}
