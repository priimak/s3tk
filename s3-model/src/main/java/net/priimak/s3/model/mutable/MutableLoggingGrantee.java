package net.priimak.s3.model.mutable;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import net.priimak.s3.model.bare.LoggingGrantee;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Grantee")
public final class MutableLoggingGrantee implements LoggingGrantee {
    private String emailAddress;

    public MutableLoggingGrantee() { }

    public MutableLoggingGrantee(LoggingGrantee original) {
        emailAddress = original.getEmailAddress();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }

        MutableLoggingGrantee other = (MutableLoggingGrantee) otherObject;
        return Objects.equals(emailAddress, other.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }

    @Override
    @XmlElement(name = "EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public MutableLoggingGrantee setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
}
