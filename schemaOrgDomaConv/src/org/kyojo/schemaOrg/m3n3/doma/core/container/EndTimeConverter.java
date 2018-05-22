package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.END_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.EndTime;

@ExternalDomain
public class EndTimeConverter implements DomainConverter<EndTime, Date> {

	@Override
	public Date fromDomainToValue(EndTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public EndTime fromValueToDomain(Date value) {
		return new END_TIME(value);
	}

}
