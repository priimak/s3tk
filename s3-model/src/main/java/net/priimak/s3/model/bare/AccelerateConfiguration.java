package net.priimak.s3.model.bare;

import net.priimak.s3.model.primitives.AccelerateConfigurationStatus;

/**
 * Bucket Accelerate.
 * <p>
 * See original specification here
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETaccelerate.html">RESTBucketGETaccelerate</a>.
 */
public interface AccelerateConfiguration {
    AccelerateConfigurationStatus getStatus();
}
