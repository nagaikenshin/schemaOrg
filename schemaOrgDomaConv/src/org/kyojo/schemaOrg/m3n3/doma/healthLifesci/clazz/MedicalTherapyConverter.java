package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_THERAPY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalTherapy;

@ExternalDomain
public class MedicalTherapyConverter implements DomainConverter<MedicalTherapy, String> {

	@Override
	public String fromDomainToValue(MedicalTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalTherapy fromValueToDomain(String value) {
		return new MEDICAL_THERAPY(value);
	}

}
