@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(type = Instant.class, value = InstantAdapter.class)
})
package net.priimak.s3.model.mutable;

import java.time.Instant;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import net.priimak.s3.jaxb.InstantAdapter;
