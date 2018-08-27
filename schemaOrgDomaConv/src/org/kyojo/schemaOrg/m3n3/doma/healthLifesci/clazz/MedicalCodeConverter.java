package org.kyojo.schemaorg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_CODE;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalCode;

@ExternalDomain
public class MedicalCodeConverter implements DomainConverter<MedicalCode, String> {

	@Override
	public String fromDomainToValue(MedicalCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalCode fromValueToDomain(String value) {
		return new MEDICAL_CODE(value);
	}

}
