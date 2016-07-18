package net.priimak.s3.model.bare;

import java.util.List;

public interface CloudFunctionConfiguration {
    String getId();

    String getCloudFunction();

    List<String> getEvents();
}
