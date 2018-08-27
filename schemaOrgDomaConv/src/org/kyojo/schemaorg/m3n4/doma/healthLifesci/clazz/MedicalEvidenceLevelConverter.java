package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_EVIDENCE_LEVEL;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalEvidenceLevel;

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
