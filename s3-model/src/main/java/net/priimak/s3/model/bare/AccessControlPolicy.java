package net.priimak.s3.model.bare;

import java.util.List;

public interface AccessControlPolicy {
    CanonicalUser getOwner();

    List<Grant> getAccessControlList();
}
