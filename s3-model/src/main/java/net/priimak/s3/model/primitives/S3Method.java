package net.priimak.s3.model.primitives;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum S3Method {
    GET,
    PUT,
    HEAD,
    POST,
    DELETE
}
