package net.priimak.s3.model.primitives;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum StorageClass {
    STANDARD,
    STANDARD_IA,
    REDUCED_REDUNDANCY,
    GLACIER
}
