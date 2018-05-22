package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LEGAL_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.LegalName;

@ExternalDomain
public class LegalNameConverter implements DomainConverter<LegalName, String> {

	@Override
	public String fromDomainToValue(LegalName domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegalName fromValueToDomain(String value) {
		return new LEGAL_NAME(value);
	}

}
