package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_ACCESSIBLE_FOR_FREE;
import org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree;

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
