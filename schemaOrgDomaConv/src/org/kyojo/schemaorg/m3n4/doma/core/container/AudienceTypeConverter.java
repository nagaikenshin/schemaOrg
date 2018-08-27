package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AUDIENCE_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.AudienceType;

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
