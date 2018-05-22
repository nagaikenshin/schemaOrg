package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalDevicePurpose;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalDevicePurpose.THERAPEUTIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalDevicePurpose.Therapeutic;

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
