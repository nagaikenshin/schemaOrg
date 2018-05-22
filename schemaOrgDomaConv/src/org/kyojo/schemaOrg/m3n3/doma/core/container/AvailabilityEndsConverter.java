package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABILITY_ENDS;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailabilityEnds;

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
