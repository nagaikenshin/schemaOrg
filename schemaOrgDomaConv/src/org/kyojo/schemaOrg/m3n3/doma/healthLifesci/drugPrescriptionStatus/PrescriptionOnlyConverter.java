package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugPrescriptionStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugPrescriptionStatus.PRESCRIPTION_ONLY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugPrescriptionStatus.PrescriptionOnly;

@ExternalDomain
public class PrescriptionOnlyConverter implements DomainConverter<PrescriptionOnly, String> {

	@Override
	public String fromDomainToValue(PrescriptionOnly domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrescriptionOnly fromValueToDomain(String value) {
		return new PRESCRIPTION_ONLY(value);
	}

}
