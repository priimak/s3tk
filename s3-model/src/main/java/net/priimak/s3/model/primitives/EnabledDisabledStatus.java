package net.priimak.s3.model.primitives;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum EnabledDisabledStatus {
    @XmlEnumValue("Enabled") ENABLED,
    @XmlEnumValue("Disabled") DISABLED
}
