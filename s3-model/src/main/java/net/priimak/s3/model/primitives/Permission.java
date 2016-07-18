package net.priimak.s3.model.primitives;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Permission for specific operations within S3 model.
 * <p>
 * See original specification here
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTacl.html">RESTBucketPUTacl</a>
 */
@XmlEnum
public enum Permission {
    FULL_CONTROL,
    WRITE,
    WRITE_ACP,
    READ,
    READ_ACP
}
