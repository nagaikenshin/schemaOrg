package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_SIGN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSign;

@ExternalDomain
public class MedicalSignConverter implements DomainConverter<MedicalSign, String> {

	@Override
	public String fromDomainToValue(MedicalSign domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalSign fromValueToDomain(String value) {
		return new MEDICAL_SIGN(value);
	}

}
