package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUDIENCE_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.AudienceType;

@ExternalDomain
public class AudienceTypeConverter implements DomainConverter<AudienceType, String> {

	@Override
	public String fromDomainToValue(AudienceType domain) {
		return domain.getNativeValue();
	}

	@Override
	public AudienceType fromValueToDomain(String value) {
		return new AUDIENCE_TYPE(value);
	}

}
