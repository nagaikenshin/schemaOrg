package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.MUSCULOSKELETAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Musculoskeletal;

@ExternalDomain
public class MusculoskeletalConverter implements DomainConverter<Musculoskeletal, String> {

	@Override
	public String fromDomainToValue(Musculoskeletal domain) {
		return domain.getNativeValue();
	}

	@Override
	public Musculoskeletal fromValueToDomain(String value) {
		return new MUSCULOSKELETAL(value);
	}

}
