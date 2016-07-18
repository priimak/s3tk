package net.priimak.s3.model.mutable;

import java.util.Objects;
import net.priimak.s3.model.bare.LocationConstraint;
import net.priimak.s3.model.primitives.LocationContsraintValue;

public final class MutableLocationConstraint implements LocationConstraint {
    private LocationContsraintValue locationContsraintValue;

    public MutableLocationConstraint() { }

    public MutableLocationConstraint(LocationConstraint original) {
        locationContsraintValue = original.getValue();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableLocationConstraint other = (MutableLocationConstraint) otherObject;
        return Objects.equals(locationContsraintValue, other.locationContsraintValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationContsraintValue);
    }

    @Override
    public LocationContsraintValue getValue() {
        return locationContsraintValue;
    }

    public MutableLocationConstraint setValue(LocationContsraintValue value) {
        locationContsraintValue = value;
        return this;
    }
}
