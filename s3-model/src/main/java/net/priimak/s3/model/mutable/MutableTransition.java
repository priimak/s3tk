package net.priimak.s3.model.mutable;

import java.time.Instant;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.AtOrInDays;
import net.priimak.s3.model.bare.Transition;
import net.priimak.s3.model.primitives.AtDate;
import net.priimak.s3.model.primitives.InDays;
import net.priimak.s3.model.primitives.StorageClass;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Transition")
public final class MutableTransition implements Transition {
    private AtOrInDays atOrInDays;
    private StorageClass storageClass;

    public MutableTransition() { }

    public MutableTransition(Transition original) {
        atOrInDays = original.getAtOrInDays();
        storageClass = original.getStorageClass();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableTransition other = (MutableTransition) otherObject;
        return Objects.equals(atOrInDays, other.atOrInDays)
            && Objects.equals(storageClass, other.storageClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atOrInDays, storageClass);
    }

    @Override
    public AtOrInDays getAtOrInDays() {
        return atOrInDays;
    }

    public MutableTransition setAtOrInDays(Instant instant) {
        atOrInDays = instant == null
            ? null
            : new AtDate(instant);
        return this;
    }

    public MutableTransition setAtOrInDays(int days) {
        atOrInDays = new InDays(days);
        return this;
    }

    public MutableTransition setAtOrInDays(AtOrInDays atOrInDays) {
        this.atOrInDays = atOrInDays;
        return this;
    }

    @Override
    @XmlElement(name = "StorageClass")
    public StorageClass getStorageClass() {
        return storageClass;
    }

    @XmlElement(name = "Days")
    public Integer getDays() {
        return atOrInDays.accept(AtOrInDays.DaysExtractor.INSTANCE, null);
    }

    @XmlElement(name = "Date")
    public Instant getDate() {
        return atOrInDays.accept(AtOrInDays.DateExtractor.INSTANCE, null);
    }
}
