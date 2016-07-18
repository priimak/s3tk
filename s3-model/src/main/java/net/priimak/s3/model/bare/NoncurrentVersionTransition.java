package net.priimak.s3.model.bare;

import net.priimak.s3.model.primitives.StorageClass;

public interface NoncurrentVersionTransition {
    int getNoncurrentDays();

    /**
     * Must return either @link StorageClass#STANDARD_IA} or {@link StorageClass#GLACIER}
     */
    StorageClass getStorageClass();
}
