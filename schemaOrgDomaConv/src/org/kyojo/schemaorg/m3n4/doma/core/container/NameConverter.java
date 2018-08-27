package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

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
