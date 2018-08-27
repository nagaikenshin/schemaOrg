package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.BODY_TYPE;
import org.kyojo.schemaorg.m3n4.auto.Container.BodyType;

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
