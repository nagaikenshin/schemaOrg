package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUITABLE_FOR_DIET;
import org.kyojo.schemaOrg.m3n3.core.Container.SuitableForDiet;

@ExternalDomain
public class SuitableForDietConverter implements DomainConverter<SuitableForDiet, String> {

	@Override
	public String fromDomainToValue(SuitableForDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuitableForDiet fromValueToDomain(String value) {
		return new SUITABLE_FOR_DIET(value);
	}

}
