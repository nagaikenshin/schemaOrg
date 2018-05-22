package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GENDER_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GenderType;

@ExternalDomain
public class GenderTypeConverter implements DomainConverter<GenderType, String> {

	@Override
	public String fromDomainToValue(GenderType domain) {
		return domain.getNativeValue();
	}

	@Override
	public GenderType fromValueToDomain(String value) {
		return new GENDER_TYPE(value);
	}

}
