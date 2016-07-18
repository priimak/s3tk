package net.priimak.s3.model.mutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.BucketLoggingStatus;
import net.priimak.s3.model.bare.LoggingEnabled;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "BucketLoggingStatus")
public final class MutableBucketLoggingStatus implements BucketLoggingStatus {
    private final List<LoggingEnabled> loggingEnabledList;

    public MutableBucketLoggingStatus() {
        loggingEnabledList = new ArrayList<>();
    }

    public MutableBucketLoggingStatus(BucketLoggingStatus original) {
        loggingEnabledList = original.getLoggingEnabled().stream()
            .map(MutableLoggingEnabled::new)
            .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableBucketLoggingStatus other = (MutableBucketLoggingStatus) otherObject;
        return Objects.equals(loggingEnabledList, other.loggingEnabledList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggingEnabledList);
    }

    @Override
    @XmlElement(name = "LoggingEnabled")
    public List<LoggingEnabled> getLoggingEnabled() {
        return loggingEnabledList;
    }

    public MutableBucketLoggingStatus setLoggingEnabled(List<LoggingEnabled> loggingEnabled) {
        loggingEnabledList.clear();
        loggingEnabledList.addAll(loggingEnabled);
        return this;
    }
}
