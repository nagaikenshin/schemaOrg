package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCHEDULED_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.ScheduledTime;

@ExternalDomain
public class ScheduledTimeConverter implements DomainConverter<ScheduledTime, Date> {

	@Override
	public Date fromDomainToValue(ScheduledTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public ScheduledTime fromValueToDomain(Date value) {
		return new SCHEDULED_TIME(value);
	}

}
