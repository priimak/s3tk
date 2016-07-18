package net.priimak.s3.model.bare;

import java.time.Instant;

public interface Bucket {
    Instant getCreationDate();

    String getName();
}
