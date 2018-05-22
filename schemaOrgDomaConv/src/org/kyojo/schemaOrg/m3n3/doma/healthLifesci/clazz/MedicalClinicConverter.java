package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_CLINIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalClinic;

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
