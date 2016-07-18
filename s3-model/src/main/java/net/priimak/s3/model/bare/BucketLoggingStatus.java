package net.priimak.s3.model.bare;

import java.util.List;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlogging.html">RESTBucketGETlogging</a>
 */
public interface BucketLoggingStatus {
    List<LoggingEnabled> getLoggingEnabled();
}
