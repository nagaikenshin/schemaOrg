package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPOUSE;
import org.kyojo.schemaOrg.m3n3.core.Container.Spouse;

@ExternalDomain
public class SpouseConverter implements DomainConverter<Spouse, String> {

	@Override
	public String fromDomainToValue(Spouse domain) {
		return domain.getNativeValue();
	}

	@Override
	public Spouse fromValueToDomain(String value) {
		return new SPOUSE(value);
	}

}
