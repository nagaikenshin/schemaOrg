package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.AVAILABILITY_ENDS;
import org.kyojo.schemaorg.m3n4.pending.Container.AvailabilityEnds;

@ExternalDomain
public class AvailabilityEndsConverter implements DomainConverter<AvailabilityEnds, Date> {

	@Override
	public Date fromDomainToValue(AvailabilityEnds domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailabilityEnds fromValueToDomain(Date value) {
		return new AVAILABILITY_ENDS(value);
	}

}
