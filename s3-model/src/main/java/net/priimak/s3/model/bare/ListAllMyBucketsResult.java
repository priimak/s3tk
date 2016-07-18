package net.priimak.s3.model.bare;

import java.util.List;

public interface ListAllMyBucketsResult {
    CanonicalUser getOwner();

    List<? extends Bucket> getBuckets();
}
