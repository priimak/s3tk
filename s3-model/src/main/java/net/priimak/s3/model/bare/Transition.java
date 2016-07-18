package net.priimak.s3.model.bare;

import net.priimak.s3.model.primitives.StorageClass;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlifecycle.html">RESTBucketGETlifecycle</a>
 *
 */
public interface Transition {
    AtOrInDays getAtOrInDays();

    StorageClass getStorageClass();
}
