package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PRESCRIPTION_STATUS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PrescriptionStatus;

@ExternalDomain
public class PrescriptionStatusConverter implements DomainConverter<PrescriptionStatus, String> {

	@Override
	public String fromDomainToValue(PrescriptionStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrescriptionStatus fromValueToDomain(String value) {
		return new PRESCRIPTION_STATUS(value);
	}

}
