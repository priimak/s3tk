package net.priimak.s3.model.primitives;

import java.util.Objects;
import net.priimak.s3.model.bare.AtOrInDays;
import net.priimak.s3.model.bare.AtOrInVisitor;

public class InDays implements AtOrInDays {
    private final int days;

    public InDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        InDays other = (InDays) otherObject;
        return days == other.days;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(days);
    }

    @Override
    public <T, P> T accept(AtOrInVisitor<T, P> visitor, P parameter) {
        return visitor.visitInDays(this, parameter);
    }

    public int getDays() {
        return days;
    }
}
