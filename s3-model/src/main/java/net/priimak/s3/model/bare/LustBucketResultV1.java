package net.priimak.s3.model.bare;

import java.util.List;

public interface LustBucketResultV1 {
    List<Content> getContents();

    String getDelimiter();

    List<CommonPrefix> getCommonPrefixes();

    String getEncodingType();

    boolean isTruncated();

    int getMaxKeys();

    String getName();

    String getMarker();

    String getNextMarker();

    String getPrefix();
}
