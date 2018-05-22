package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DOOR_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.DoorTime;

@ExternalDomain
public class DoorTimeConverter implements DomainConverter<DoorTime, Date> {

	@Override
	public Date fromDomainToValue(DoorTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public DoorTime fromValueToDomain(Date value) {
		return new DOOR_TIME(value);
	}

}
