package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GENDER;
import org.kyojo.schemaorg.m3n4.core.Container.Gender;

@ExternalDomain
public class GenderConverter implements DomainConverter<Gender, String> {

	@Override
	public String fromDomainToValue(Gender domain) {
		return domain.getNativeValue();
	}

	@Override
	public Gender fromValueToDomain(String value) {
		return new GENDER(value);
	}

}
