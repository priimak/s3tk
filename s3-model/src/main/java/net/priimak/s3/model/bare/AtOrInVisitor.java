package net.priimak.s3.model.bare;

import net.priimak.s3.model.primitives.AtDate;
import net.priimak.s3.model.primitives.InDays;

public interface AtOrInVisitor<T, P> {
    T visitAtDate(AtDate atDate, P parameter);

    T visitInDays(InDays inDays, P parameter);
}
