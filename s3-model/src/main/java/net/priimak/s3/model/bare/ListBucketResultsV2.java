package net.priimak.s3.model.bare;

import java.util.List;

public interface ListBucketResultsV2 {
    List<Content> getContents();

    String getDelimiter();

    List<CommonPrefix> getCommonPrefixes();

    String getEncodingType();

    boolean isTruncated();

    int getMaxKeys();

    String getName();

    String getPrefix();

    String getContinuationToken();

    int getKeyCount();

    String getNextContinuationToken();

    String getStartAfter();
}
