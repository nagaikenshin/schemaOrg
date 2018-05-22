package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARRIVAL_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.ArrivalTime;

@ExternalDomain
public class ArrivalTimeConverter implements DomainConverter<ArrivalTime, Date> {

	@Override
	public Date fromDomainToValue(ArrivalTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArrivalTime fromValueToDomain(Date value) {
		return new ARRIVAL_TIME(value);
	}

}
