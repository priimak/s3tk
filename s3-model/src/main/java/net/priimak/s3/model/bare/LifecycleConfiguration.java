package net.priimak.s3.model.bare;

import java.util.List;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlifecycle.html">RESTBucketGETlifecycle</a>
 */
public interface LifecycleConfiguration {
    List<Rule> getRules();
}
