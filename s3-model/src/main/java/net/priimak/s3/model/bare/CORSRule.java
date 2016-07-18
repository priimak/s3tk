package net.priimak.s3.model.bare;

import java.util.List;
import net.priimak.s3.model.primitives.S3Method;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETcors.html">RESTBucketGETcors</a>
 */
public interface CORSRule {
    String getID();

    List<String> getAllowedHeaders();

    List<String> getAllowedOrigins();

    List<String> getExposeHeaders();

    S3Method getAllowedMethod();

    int gteMaxAgeSeconds();
}
