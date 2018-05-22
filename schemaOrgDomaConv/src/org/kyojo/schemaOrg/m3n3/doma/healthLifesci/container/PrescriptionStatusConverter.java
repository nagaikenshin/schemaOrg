package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PRESCRIPTION_STATUS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PrescriptionStatus;

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
