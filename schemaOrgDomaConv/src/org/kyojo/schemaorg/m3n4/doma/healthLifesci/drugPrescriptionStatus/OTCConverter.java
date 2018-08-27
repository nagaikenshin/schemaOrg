package org.kyojo.schemaorg.m3n4.doma.healthLifesci.drugPrescriptionStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.drugPrescriptionStatus.OTC;
import org.kyojo.schemaorg.m3n4.healthLifesci.DrugPrescriptionStatus;

@ExternalDomain
public class OTCConverter implements DomainConverter<DrugPrescriptionStatus.OTC, String> {

	@Override
	public String fromDomainToValue(DrugPrescriptionStatus.OTC domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugPrescriptionStatus.OTC fromValueToDomain(String value) {
		return new OTC(value);
	}

}
