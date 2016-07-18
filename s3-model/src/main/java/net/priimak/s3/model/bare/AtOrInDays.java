package net.priimak.s3.model.bare;

import java.time.Instant;
import net.priimak.s3.model.primitives.AtDate;
import net.priimak.s3.model.primitives.InDays;

public interface AtOrInDays {
    <T, P> T accept(AtOrInVisitor<T, P> visitor, P parameter);

    enum DateExtractor implements AtOrInVisitor<Instant, Void> {
        INSTANCE;

        @Override
        public Instant visitAtDate(AtDate atDate, Void parameter) {
            return atDate.getInstant();
        }

        @Override
        public Instant visitInDays(InDays inDays, Void parameter) {
            return null;
        }
    }

    enum DaysExtractor implements AtOrInVisitor<Integer, Void> {
        INSTANCE;

        @Override
        public Integer visitAtDate(AtDate atDate, Void parameter) {
            return null;
        }

        @Override
        public Integer visitInDays(InDays inDays, Void parameter) {
            return inDays.getDays();
        }
    }
}
