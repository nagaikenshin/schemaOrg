package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SMOKING_ALLOWED;
import org.kyojo.schemaorg.m3n4.core.Container.SmokingAllowed;

@ExternalDomain
public class SmokingAllowedConverter implements DomainConverter<SmokingAllowed, Boolean> {

	@Override
	public Boolean fromDomainToValue(SmokingAllowed domain) {
		return domain.getNativeValue();
	}

	@Override
	public SmokingAllowed fromValueToDomain(Boolean value) {
		return new SMOKING_ALLOWED(value);
	}

}
