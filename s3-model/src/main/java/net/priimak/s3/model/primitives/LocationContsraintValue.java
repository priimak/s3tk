package net.priimak.s3.model.primitives;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum LocationContsraintValue {
    @XmlEnumValue("us-west-1") US_WEST_1,
    @XmlEnumValue("us-west-2") US_WEST_2,
    @XmlEnumValue("EU") EU,
    @XmlEnumValue("wu-west-1") EU_WEST_1,
    @XmlEnumValue("wu-central-1") EU_CENTRAL_1,
    @XmlEnumValue("wu-southeast-1") EU_SOUTHEAST_1,
    @XmlEnumValue("wu-southeast-2") EU_SOUTHEAST_2,
    @XmlEnumValue("wu-northeast-1") EU_NORTHEAST_1,
    @XmlEnumValue("wu-northeast-2") EU_NORTHEAST_2,
    @XmlEnumValue("sa-east-1") SA_EAST_1,
    @XmlEnumValue("") US_EAST,
}
