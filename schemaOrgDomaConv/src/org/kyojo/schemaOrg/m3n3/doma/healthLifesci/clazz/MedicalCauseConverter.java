package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_CAUSE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalCause;

@ExternalDomain
public class MedicalCauseConverter implements DomainConverter<MedicalCause, String> {

	@Override
	public String fromDomainToValue(MedicalCause domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalCause fromValueToDomain(String value) {
		return new MEDICAL_CAUSE(value);
	}

}
