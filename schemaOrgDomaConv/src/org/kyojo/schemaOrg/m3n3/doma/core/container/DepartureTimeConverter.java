package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTURE_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.DepartureTime;

@ExternalDomain
public class DepartureTimeConverter implements DomainConverter<DepartureTime, Date> {

	@Override
	public Date fromDomainToValue(DepartureTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartureTime fromValueToDomain(Date value) {
		return new DEPARTURE_TIME(value);
	}

}
