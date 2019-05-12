package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.IS_VARIANT_OF;
import org.kyojo.schemaorg.m3n5.core.Container.IsVariantOf;

@ExternalDomain
public class IsVariantOfConverter implements DomainConverter<IsVariantOf, String> {

	@Override
	public String fromDomainToValue(IsVariantOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsVariantOf fromValueToDomain(String value) {
		return new IS_VARIANT_OF(value);
	}

}
