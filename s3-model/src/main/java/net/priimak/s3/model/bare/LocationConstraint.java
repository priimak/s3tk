package net.priimak.s3.model.bare;

import net.priimak.s3.model.primitives.LocationContsraintValue;

/**
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlocation.html">RESTBucketGETlocation</a>.
 */
public interface LocationConstraint {
    LocationContsraintValue getValue();
}
