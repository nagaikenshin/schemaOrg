package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FAX_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.FaxNumber;

@ExternalDomain
public class FaxNumberConverter implements DomainConverter<FaxNumber, String> {

	@Override
	public String fromDomainToValue(FaxNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public FaxNumber fromValueToDomain(String value) {
		return new FAX_NUMBER(value);
	}

}
