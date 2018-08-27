package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.COMPRISED_OF;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ComprisedOf;

@ExternalDomain
public class ComprisedOfConverter implements DomainConverter<ComprisedOf, String> {

	@Override
	public String fromDomainToValue(ComprisedOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComprisedOf fromValueToDomain(String value) {
		return new COMPRISED_OF(value);
	}

}
