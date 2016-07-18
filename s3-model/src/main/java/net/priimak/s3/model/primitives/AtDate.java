package net.priimak.s3.model.primitives;

import java.time.Instant;
import java.util.Objects;
import net.priimak.s3.model.bare.AtOrInDays;
import net.priimak.s3.model.bare.AtOrInVisitor;

public class AtDate implements AtOrInDays {
    private Instant instant;

    public AtDate(Instant instant) {
        Objects.requireNonNull(instant);
        this.instant = instant;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        AtDate other = (AtDate) otherObject;
        return Objects.equals(instant, other.instant);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(instant);
    }

    @Override
    public <T, P> T accept(AtOrInVisitor<T, P> visitor, P parameter) {
        return visitor.visitAtDate(this, parameter);
    }

    public Instant getInstant() {
        return instant;
    }
}
