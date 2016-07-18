package net.priimak.s3.model.bare;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlifecycle.html">RESTBucketGETlifecycle</a>
 */
public interface NoncurrentVersionExpiration {
    int getNoncurrentDays();
}
