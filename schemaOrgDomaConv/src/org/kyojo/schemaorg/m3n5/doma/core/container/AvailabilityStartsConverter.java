package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AVAILABILITY_STARTS;
import org.kyojo.schemaorg.m3n5.core.Container.AvailabilityStarts;

@ExternalDomain
public class AvailabilityStartsConverter implements DomainConverter<AvailabilityStarts, Date> {

	@Override
	public Date fromDomainToValue(AvailabilityStarts domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailabilityStarts fromValueToDomain(Date value) {
		return new AVAILABILITY_STARTS(value);
	}

}
