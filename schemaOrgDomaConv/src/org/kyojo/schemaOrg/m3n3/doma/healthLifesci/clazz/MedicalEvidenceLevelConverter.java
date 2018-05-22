package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_EVIDENCE_LEVEL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalEvidenceLevel;

@ExternalDomain
public class MedicalEvidenceLevelConverter implements DomainConverter<MedicalEvidenceLevel, String> {

	@Override
	public String fromDomainToValue(MedicalEvidenceLevel domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalEvidenceLevel fromValueToDomain(String value) {
		return new MEDICAL_EVIDENCE_LEVEL(value);
	}

}
