package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_PRESCRIPTION_STATUS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPrescriptionStatus;

@ExternalDomain
public class DrugPrescriptionStatusConverter implements DomainConverter<DrugPrescriptionStatus, String> {

	@Override
	public String fromDomainToValue(DrugPrescriptionStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugPrescriptionStatus fromValueToDomain(String value) {
		return new DRUG_PRESCRIPTION_STATUS(value);
	}

}
