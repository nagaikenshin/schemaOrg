package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.FIRST_APPEARANCE;
import org.kyojo.schemaorg.m3n5.pending.Container.FirstAppearance;

@ExternalDomain
public class FirstAppearanceConverter implements DomainConverter<FirstAppearance, String> {

	@Override
	public String fromDomainToValue(FirstAppearance domain) {
		return domain.getNativeValue();
	}

	@Override
	public FirstAppearance fromValueToDomain(String value) {
		return new FIRST_APPEARANCE(value);
	}

}
