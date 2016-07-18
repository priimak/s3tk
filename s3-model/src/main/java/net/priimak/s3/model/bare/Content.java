package net.priimak.s3.model.bare;

import java.time.Instant;
import net.priimak.s3.model.primitives.StorageClass;

public interface Content {
    String getETag();

    String getKey();

    Instant getLastModified();

    int getSize();

    StorageClass getStorageClass();

    CanonicalUser getOwner();
}
