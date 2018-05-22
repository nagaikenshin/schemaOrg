package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_STUDY_STATUS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalStudyStatus;

@ExternalDomain
public class MedicalStudyStatusConverter implements DomainConverter<MedicalStudyStatus, String> {

	@Override
	public String fromDomainToValue(MedicalStudyStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalStudyStatus fromValueToDomain(String value) {
		return new MEDICAL_STUDY_STATUS(value);
	}

}
