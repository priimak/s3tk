package net.priimak.s3.model.mutable;

import java.time.Instant;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.Bucket;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Bucket")
public final class MutableBucket implements Bucket {
    private Instant creationDate;
    private String name;

    public MutableBucket() { }

    public MutableBucket(Bucket bucket) {
        creationDate = bucket.getCreationDate();
        name = bucket.getName();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableBucket other = (MutableBucket) otherObject;
        return Objects.equals(creationDate, other.creationDate)
            && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationDate, name);
    }

    @Override
    @XmlElement(name = "CreationDate")
    public Instant getCreationDate() {
        return creationDate;
    }

    @Override
    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public MutableBucket setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public MutableBucket setName(String name) {
        this.name = name;
        return this;
    }
}
