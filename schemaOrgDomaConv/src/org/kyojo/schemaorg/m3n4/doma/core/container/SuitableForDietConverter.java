package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SUITABLE_FOR_DIET;
import org.kyojo.schemaorg.m3n4.core.Container.SuitableForDiet;

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
