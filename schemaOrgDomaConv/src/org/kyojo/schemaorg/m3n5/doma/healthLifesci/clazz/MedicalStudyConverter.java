package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_STUDY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalStudy;

@ExternalDomain
public class MedicalStudyConverter implements DomainConverter<MedicalStudy, String> {

	@Override
	public String fromDomainToValue(MedicalStudy domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalStudy fromValueToDomain(String value) {
		return new MEDICAL_STUDY(value);
	}

}
