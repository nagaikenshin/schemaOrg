package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.START_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.StartTime;

@ExternalDomain
public class StartTimeConverter implements DomainConverter<StartTime, Date> {

	@Override
	public Date fromDomainToValue(StartTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public StartTime fromValueToDomain(Date value) {
		return new START_TIME(value);
	}

}
