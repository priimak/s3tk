package net.priimak.s3.model.bare;

import net.priimak.s3.model.primitives.Permission;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlogging.html">RESTBucketGETlogging</a>
 */
public interface LoggingGrant {
    LoggingGrantee getGrantee();

    /**
     * One of {@link Permission#FULL_CONTROL}, {@link Permission#READ} or {@link Permission#WRITE}
     */
    Permission getPermission();
}
