package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.LEGAL_STATUS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.LegalStatus;

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
