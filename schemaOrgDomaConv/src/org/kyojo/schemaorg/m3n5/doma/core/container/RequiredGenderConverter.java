package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REQUIRED_GENDER;
import org.kyojo.schemaorg.m3n5.core.Container.RequiredGender;

@ExternalDomain
public class RequiredGenderConverter implements DomainConverter<RequiredGender, String> {

	@Override
	public String fromDomainToValue(RequiredGender domain) {
		return domain.getNativeValue();
	}

	@Override
	public RequiredGender fromValueToDomain(String value) {
		return new REQUIRED_GENDER(value);
	}

}
