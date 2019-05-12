package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.OWNS;
import org.kyojo.schemaorg.m3n5.core.Container.Owns;

@ExternalDomain
public class OwnsConverter implements DomainConverter<Owns, String> {

	@Override
	public String fromDomainToValue(Owns domain) {
		return domain.getNativeValue();
	}

	@Override
	public Owns fromValueToDomain(String value) {
		return new OWNS(value);
	}

}
