package net.priimak.s3.jaxb;

import java.time.Instant;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public final class InstantAdapter extends XmlAdapter<String, Instant> {
    @Override
    public Instant unmarshal(String v) {
        return Instant.parse(v);
    }

    @Override
    public String marshal(Instant instant) {
        return instant.toString();
    }
}
