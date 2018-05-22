package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SMOKING_ALLOWED;
import org.kyojo.schemaOrg.m3n3.core.Container.SmokingAllowed;

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
