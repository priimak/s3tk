package net.priimak.s3.model.mutable;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.CanonicalUser;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "CanonicalUser")
public final class MutableCanonicalUser implements CanonicalUser {
    private String id;
    private String displayName;

    public MutableCanonicalUser() { }

    public MutableCanonicalUser(CanonicalUser owner) {
        id = owner.getId();
        displayName = owner.getDisplayName();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableCanonicalUser other = (MutableCanonicalUser) otherObject;
        return Objects.equals(id, other.id)
            && Objects.equals(displayName, other.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName);
    }

    @Override
    @XmlElement(name = "ID")
    public String getId() {
        return id;
    }

    @Override
    @XmlElement(name = "DisplayName")
    public String getDisplayName() {
        return displayName;
    }

    public MutableCanonicalUser setId(String id) {
        this.id = id;
        return this;
    }

    public MutableCanonicalUser setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
