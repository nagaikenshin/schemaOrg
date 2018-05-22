package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.MIDWIFERY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Midwifery;

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
