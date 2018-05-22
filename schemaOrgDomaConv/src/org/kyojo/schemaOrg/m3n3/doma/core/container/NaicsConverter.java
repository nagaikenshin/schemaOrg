package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NAICS;
import org.kyojo.schemaOrg.m3n3.core.Container.Naics;

@ExternalDomain
public class NaicsConverter implements DomainConverter<Naics, String> {

	@Override
	public String fromDomainToValue(Naics domain) {
		return domain.getNativeValue();
	}

	@Override
	public Naics fromValueToDomain(String value) {
		return new NAICS(value);
	}

}
