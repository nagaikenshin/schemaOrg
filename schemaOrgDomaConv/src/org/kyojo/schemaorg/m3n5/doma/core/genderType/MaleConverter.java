package org.kyojo.schemaorg.m3n5.doma.core.genderType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.genderType.MALE;
import org.kyojo.schemaorg.m3n5.core.GenderType.Male;

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
