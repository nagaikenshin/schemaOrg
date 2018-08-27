package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.IS_GIFT;
import org.kyojo.schemaorg.m3n4.core.Container.IsGift;

@ExternalDomain
public class IsGiftConverter implements DomainConverter<IsGift, Boolean> {

	@Override
	public Boolean fromDomainToValue(IsGift domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsGift fromValueToDomain(Boolean value) {
		return new IS_GIFT(value);
	}

}
