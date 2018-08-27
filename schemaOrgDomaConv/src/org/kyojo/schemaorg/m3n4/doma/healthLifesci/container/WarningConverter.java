package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.WARNING;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Warning;

@ExternalDomain
public class WarningConverter implements DomainConverter<Warning, String> {

	@Override
	public String fromDomainToValue(Warning domain) {
		return domain.getNativeValue();
	}

	@Override
	public Warning fromValueToDomain(String value) {
		return new WARNING(value);
	}

}
