package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.PHYSIOTHERAPY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Physiotherapy;

@ExternalDomain
public class PhysiotherapyConverter implements DomainConverter<Physiotherapy, String> {

	@Override
	public String fromDomainToValue(Physiotherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public Physiotherapy fromValueToDomain(String value) {
		return new PHYSIOTHERAPY(value);
	}

}
