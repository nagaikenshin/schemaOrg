package org.kyojo.schemaorg.m3n4.doma.core.genderType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.genderType.FEMALE;
import org.kyojo.schemaorg.m3n4.core.GenderType.Female;

@ExternalDomain
public class FemaleConverter implements DomainConverter<Female, String> {

	@Override
	public String fromDomainToValue(Female domain) {
		return domain.getNativeValue();
	}

	@Override
	public Female fromValueToDomain(String value) {
		return new FEMALE(value);
	}

}