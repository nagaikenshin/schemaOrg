package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.LEGAL_STATUS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus;

@ExternalDomain
public class LegalStatusConverter implements DomainConverter<LegalStatus, String> {

	@Override
	public String fromDomainToValue(LegalStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegalStatus fromValueToDomain(String value) {
		return new LEGAL_STATUS(value);
	}

}
