package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.COMPRISED_OF;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ComprisedOf;

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
