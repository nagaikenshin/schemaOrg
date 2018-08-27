package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalDevicePurpose;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalDevicePurpose.THERAPEUTIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalDevicePurpose.Therapeutic;

@ExternalDomain
public class TherapeuticConverter implements DomainConverter<Therapeutic, String> {

	@Override
	public String fromDomainToValue(Therapeutic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Therapeutic fromValueToDomain(String value) {
		return new THERAPEUTIC(value);
	}

}