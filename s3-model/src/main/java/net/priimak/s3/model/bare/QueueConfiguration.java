package net.priimak.s3.model.bare;

import java.util.List;

public interface QueueConfiguration {
    String getId();

    String getTopic();

    Filter getFilter();

    List<String> getEvents();
}
