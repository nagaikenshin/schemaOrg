package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.BODY_TYPE;
import org.kyojo.schemaOrg.m3n3.auto.Container.BodyType;

@ExternalDomain
public class BodyTypeConverter implements DomainConverter<BodyType, String> {

	@Override
	public String fromDomainToValue(BodyType domain) {
		return domain.getNativeValue();
	}

	@Override
	public BodyType fromValueToDomain(String value) {
		return new BODY_TYPE(value);
	}

}
