package net.priimak.s3.model.bare;

public interface Expiration {
    AtOrInDays getAtOrInDays();

    Boolean getExpiredObjectDeleteMarker();
}
