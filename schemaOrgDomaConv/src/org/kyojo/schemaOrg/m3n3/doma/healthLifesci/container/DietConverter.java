package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIET;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diet;

@ExternalDomain
public class DietConverter implements DomainConverter<Diet, String> {

	@Override
	public String fromDomainToValue(Diet domain) {
		return domain.getNativeValue();
	}

	@Override
	public Diet fromValueToDomain(String value) {
		return new DIET(value);
	}

}
