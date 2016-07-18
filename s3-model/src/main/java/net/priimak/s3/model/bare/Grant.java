package net.priimak.s3.model.bare;

import net.priimak.s3.model.primitives.Permission;

public interface Grant {
    CanonicalUser getGrantee();

    Permission getPermission();
}
