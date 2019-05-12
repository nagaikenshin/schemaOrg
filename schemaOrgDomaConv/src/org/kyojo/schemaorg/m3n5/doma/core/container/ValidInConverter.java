package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VALID_IN;
import org.kyojo.schemaorg.m3n5.core.Container.ValidIn;

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
