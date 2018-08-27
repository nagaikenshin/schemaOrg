package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PERFORM_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.PerformTime;

@ExternalDomain
public class PerformTimeConverter implements DomainConverter<PerformTime, String> {

	@Override
	public String fromDomainToValue(PerformTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public PerformTime fromValueToDomain(String value) {
		return new PERFORM_TIME(value);
	}

}
