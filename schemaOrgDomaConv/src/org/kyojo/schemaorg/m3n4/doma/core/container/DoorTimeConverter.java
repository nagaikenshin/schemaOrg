package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DOOR_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.DoorTime;

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
