package net.priimak.s3.model.bare;

import java.util.List;

public interface TopicConfiguration {
    String getId();

    String getTopic();

    List<String> getEvents();

    Filter getFilter();
}
