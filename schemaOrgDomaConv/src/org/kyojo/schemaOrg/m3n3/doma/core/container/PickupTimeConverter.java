package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PICKUP_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.PickupTime;

@ExternalDomain
public class PickupTimeConverter implements DomainConverter<PickupTime, Date> {

	@Override
	public Date fromDomainToValue(PickupTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public PickupTime fromValueToDomain(Date value) {
		return new PICKUP_TIME(value);
	}

}
