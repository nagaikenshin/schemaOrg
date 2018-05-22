package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERMIT_AUDIENCE;
import org.kyojo.schemaOrg.m3n3.core.Container.PermitAudience;

@ExternalDomain
public class PermitAudienceConverter implements DomainConverter<PermitAudience, String> {

	@Override
	public String fromDomainToValue(PermitAudience domain) {
		return domain.getNativeValue();
	}

	@Override
	public PermitAudience fromValueToDomain(String value) {
		return new PERMIT_AUDIENCE(value);
	}

}
