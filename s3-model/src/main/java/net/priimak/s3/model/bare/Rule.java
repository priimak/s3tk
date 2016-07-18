package net.priimak.s3.model.bare;

import java.util.List;
import net.priimak.s3.model.primitives.EnabledDisabledStatus;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlifecycle.html">RESTBucketGETlifecycle</a>
 */
public interface Rule {
    String getID();

    String getPrefix();

    EnabledDisabledStatus getStatus();

    AbortIncompleteMultipartUpload getAbortIncompleteMultipartUpload();

    Expiration getExpiration();

    NoncurrentVersionExpiration getNoncurrentVersionExpiration();

    List<NoncurrentVersionTransition> getNoncurrentVersionTransitions();

    List<Transition> getTransitions();
}
