package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALID_IN;
import org.kyojo.schemaOrg.m3n3.core.Container.ValidIn;

@ExternalDomain
public class ValidInConverter implements DomainConverter<ValidIn, String> {

	@Override
	public String fromDomainToValue(ValidIn domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValidIn fromValueToDomain(String value) {
		return new VALID_IN(value);
	}

}
