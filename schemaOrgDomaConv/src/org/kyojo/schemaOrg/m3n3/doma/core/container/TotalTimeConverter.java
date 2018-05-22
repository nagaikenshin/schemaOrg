package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TOTAL_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.TotalTime;

@ExternalDomain
public class TotalTimeConverter implements DomainConverter<TotalTime, String> {

	@Override
	public String fromDomainToValue(TotalTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public TotalTime fromValueToDomain(String value) {
		return new TOTAL_TIME(value);
	}

}
