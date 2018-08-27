package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_CLINIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalClinic;

@ExternalDomain
public class MedicalClinicConverter implements DomainConverter<MedicalClinic, String> {

	@Override
	public String fromDomainToValue(MedicalClinic domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalClinic fromValueToDomain(String value) {
		return new MEDICAL_CLINIC(value);
	}

}
