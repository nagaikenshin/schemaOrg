package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.MIDWIFERY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Midwifery;

@ExternalDomain
public class MidwiferyConverter implements DomainConverter<Midwifery, String> {

	@Override
	public String fromDomainToValue(Midwifery domain) {
		return domain.getNativeValue();
	}

	@Override
	public Midwifery fromValueToDomain(String value) {
		return new MIDWIFERY(value);
	}

}