package net.priimak.s3.model.bare;

import java.util.List;

public interface NotificationConfiguration {
    List<TopicConfiguration> getTopicConfigurations();

    List<QueueConfiguration> getQueueConfigurations();

    List<CloudFunctionConfiguration> getCloudFunctionConfigurations();
}
