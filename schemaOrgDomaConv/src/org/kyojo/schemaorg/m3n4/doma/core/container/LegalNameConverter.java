package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LEGAL_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.LegalName;

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
