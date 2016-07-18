package net.priimak.s3.model.primitives;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Status of {@link net.priimak.s3ms.model.bare.AccelerateConfiguration}
 * <p>
 * See original specification here
 * <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETaccelerate.html">RESTBucketGETaccelerate</a>.
 */
@XmlEnum
public enum AccelerateConfigurationStatus {
    @XmlEnumValue("Enabled") ENABLED,
    @XmlEnumValue("Suspended") SUSPENDED
}
