package net.priimak.s3.model.mutable;

import java.util.Objects;
import net.priimak.s3.model.bare.CanonicalUser;
import net.priimak.s3.model.bare.Grant;
import net.priimak.s3.model.primitives.Permission;

public final class MutableGrant implements Grant {
    private CanonicalUser grantee;
    private Permission permission;

    public MutableGrant() { }

    public MutableGrant(Grant original) {
        grantee = new MutableCanonicalUser(original.getGrantee());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableGrant other = (MutableGrant) otherObject;
        return Objects.equals(grantee, other.grantee)
            && Objects.equals(permission, other.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantee, permission);
    }

    @Override
    public CanonicalUser getGrantee() {
        return grantee;
    }

    @Override
    public Permission getPermission() {
        return permission;
    }

    public MutableGrant setGrantee(CanonicalUser grantee) {
        this.grantee = grantee;
        return this;
    }

    public MutableGrant setPermission(Permission permission) {
        this.permission = permission;
        return this;
    }
}
