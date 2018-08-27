package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PERMIT_AUDIENCE;
import org.kyojo.schemaorg.m3n4.core.Container.PermitAudience;

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
