package net.priimak.s3.model.bare;

import java.util.List;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETcors.html">RESTBucketGETcors</a>
 */
public interface CORSConfiguration {
    List<CORSRule> getCORSRules();
}
