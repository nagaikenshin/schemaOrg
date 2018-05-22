package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

@ExternalDomain
public class NameConverter implements DomainConverter<Name, String> {

	@Override
	public String fromDomainToValue(Name domain) {
		return domain.getNativeValue();
	}

	@Override
	public Name fromValueToDomain(String value) {
		return new NAME(value);
	}

}
