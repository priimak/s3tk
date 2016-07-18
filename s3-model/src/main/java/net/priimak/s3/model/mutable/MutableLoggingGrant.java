package net.priimak.s3.model.mutable;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.LoggingGrant;
import net.priimak.s3.model.bare.LoggingGrantee;
import net.priimak.s3.model.primitives.Permission;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Grant")
public final class MutableLoggingGrant implements LoggingGrant {
    private LoggingGrantee grantee;
    private Permission permission;

    public MutableLoggingGrant() { }

    public MutableLoggingGrant(LoggingGrant original) {
        grantee = new MutableLoggingGrantee(original.getGrantee());
        permission = original.getPermission();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableLoggingGrant other = (MutableLoggingGrant) otherObject;
        return Objects.equals(grantee, other.grantee)
            && Objects.equals(permission, other.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantee, permission);
    }

    @Override
    @XmlElement(name = "Grantee")
    public LoggingGrantee getGrantee() {
        return grantee;
    }

    @Override
    @XmlElement(name = "Permission")
    public Permission getPermission() {
        return permission;
    }

    public MutableLoggingGrant setGrantee(MutableLoggingGrantee grantee) {
        this.grantee = grantee;
        return this;
    }

    public MutableLoggingGrant setPermission(Permission permission) {
        this.permission = permission;
        return this;
    }
}
