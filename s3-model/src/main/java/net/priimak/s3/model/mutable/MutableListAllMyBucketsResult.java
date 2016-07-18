package net.priimak.s3.model.mutable;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.CanonicalUser;
import net.priimak.s3.model.bare.ListAllMyBucketsResult;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "ListAllMyBucketsResult")
public final class MutableListAllMyBucketsResult implements ListAllMyBucketsResult {
    private MutableCanonicalUser owner;
    private List<MutableBucket> buckets;

    public MutableListAllMyBucketsResult() {
        buckets = new LinkedList<>();
    }

    public MutableListAllMyBucketsResult(ListAllMyBucketsResult listAllMyBucketsResult) {
        owner =  new MutableCanonicalUser(listAllMyBucketsResult.getOwner());
        buckets = listAllMyBucketsResult.getBuckets().stream().map(MutableBucket::new).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableListAllMyBucketsResult other = (MutableListAllMyBucketsResult) otherObject;
        return Objects.equals(owner, other.owner)
            && Objects.equals(buckets, other.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, buckets);
    }

    @Override
    @XmlElement(name = "Owner")
    public MutableCanonicalUser getOwner() {
        return owner;
    }

    @Override
    @XmlElementWrapper(name = "Buckets")
    @XmlElement(name = "Bucket")
    public List<MutableBucket> getBuckets() {
        return buckets;
    }

    public MutableListAllMyBucketsResult setOwner(CanonicalUser owner) {
        this.owner = new MutableCanonicalUser(owner);
        return this;
    }

    public MutableListAllMyBucketsResult setBuckets(List<MutableBucket> buckets) {
        this.buckets.clear();
        this.buckets.addAll(buckets.stream().map(MutableBucket::new).collect(Collectors.toList()));
        return this;
    }
}
