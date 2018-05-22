package org.kyojo.schemaOrg.m3n3.doma.core.genderType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.genderType.MALE;
import org.kyojo.schemaOrg.m3n3.core.GenderType.Male;

@ExternalDomain
public class MaleConverter implements DomainConverter<Male, String> {

	@Override
	public String fromDomainToValue(Male domain) {
		return domain.getNativeValue();
	}

	@Override
	public Male fromValueToDomain(String value) {
		return new MALE(value);
	}

}
