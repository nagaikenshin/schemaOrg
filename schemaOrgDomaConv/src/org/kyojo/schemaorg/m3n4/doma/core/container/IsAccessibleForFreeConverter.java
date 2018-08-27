package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.IS_ACCESSIBLE_FOR_FREE;
import org.kyojo.schemaorg.m3n4.core.Container.IsAccessibleForFree;

@ExternalDomain
public class IsAccessibleForFreeConverter implements DomainConverter<IsAccessibleForFree, Boolean> {

	@Override
	public Boolean fromDomainToValue(IsAccessibleForFree domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsAccessibleForFree fromValueToDomain(Boolean value) {
		return new IS_ACCESSIBLE_FOR_FREE(value);
	}

}
