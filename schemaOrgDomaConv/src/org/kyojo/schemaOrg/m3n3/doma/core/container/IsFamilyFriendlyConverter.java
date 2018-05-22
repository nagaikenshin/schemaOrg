package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_FAMILY_FRIENDLY;
import org.kyojo.schemaOrg.m3n3.core.Container.IsFamilyFriendly;

@ExternalDomain
public class IsFamilyFriendlyConverter implements DomainConverter<IsFamilyFriendly, Boolean> {

	@Override
	public Boolean fromDomainToValue(IsFamilyFriendly domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsFamilyFriendly fromValueToDomain(Boolean value) {
		return new IS_FAMILY_FRIENDLY(value);
	}

}
