package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PHYSIOTHERAPY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Physiotherapy;

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
