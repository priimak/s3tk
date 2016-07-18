package net.priimak.s3.model.mutable;

import java.time.Instant;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.AtOrInDays;
import net.priimak.s3.model.bare.Expiration;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Expiration")
public final class MutableExpiration implements Expiration {
    private AtOrInDays atOrInDays;
    private Boolean expiredObjectDeleteMarker;

    public MutableExpiration() { }

    public MutableExpiration(Expiration original) {
        atOrInDays = original.getAtOrInDays();
        expiredObjectDeleteMarker = original.getExpiredObjectDeleteMarker();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableExpiration other = (MutableExpiration) otherObject;
        return Objects.equals(atOrInDays, other.atOrInDays)
            && Objects.equals(expiredObjectDeleteMarker, other.expiredObjectDeleteMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atOrInDays, expiredObjectDeleteMarker);
    }

    @Override
    public AtOrInDays getAtOrInDays() {
        return atOrInDays;
    }

    @Override
    @XmlElement(name = "ExpiredObjectDeleteMarker")
    public Boolean getExpiredObjectDeleteMarker() {
        return expiredObjectDeleteMarker;
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
