package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FOUNDER;
import org.kyojo.schemaorg.m3n4.core.Container.Founder;

@ExternalDomain
public class FounderConverter implements DomainConverter<Founder, String> {

	@Override
	public String fromDomainToValue(Founder domain) {
		return domain.getNativeValue();
	}

	@Override
	public Founder fromValueToDomain(String value) {
		return new FOUNDER(value);
	}

}
