package net.priimak.s3.model.mutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.LoggingEnabled;
import net.priimak.s3.model.bare.LoggingGrant;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "LoggingEnabled")
public final class MutableLoggingEnabled implements LoggingEnabled {
    private String targetBucket;
    private String targetPrefix;
    private final List<LoggingGrant> targetGrants;

    public MutableLoggingEnabled() {
        targetGrants = new ArrayList<>();
    }

    public MutableLoggingEnabled(LoggingEnabled original) {
        targetBucket = original.getTargetBucket();
        targetPrefix = original.getTargetPrefix();
        targetGrants = original.getTargetGrants().stream().map(MutableLoggingGrant::new).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableLoggingEnabled other = (MutableLoggingEnabled) otherObject;
        return Objects.equals(targetBucket, other.targetBucket)
            && Objects.equals(targetPrefix, other.targetPrefix)
            && Objects.equals(targetGrants, other.targetGrants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetBucket, targetPrefix, targetGrants);
    }

    @Override
    @XmlElement(name = "TargetBucket")
    public String getTargetBucket() {
        return targetBucket;
    }

    @Override
    @XmlElement(name = "TargetPrefix")
    public String getTargetPrefix() {
        return targetPrefix;
    }

    @Override
    @XmlElementWrapper(name = "TargetGrants")
    @XmlElement(name = "Grant")
    public List<LoggingGrant> getTargetGrants() {
        return targetGrants;
    }
}
