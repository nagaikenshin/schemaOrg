package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalEvidenceLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalEvidenceLevel.EVIDENCE_LEVEL_C;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalEvidenceLevel.EvidenceLevelC;

@ExternalDomain
public class EvidenceLevelCConverter implements DomainConverter<EvidenceLevelC, String> {

	@Override
	public String fromDomainToValue(EvidenceLevelC domain) {
		return domain.getNativeValue();
	}

	@Override
	public EvidenceLevelC fromValueToDomain(String value) {
		return new EVIDENCE_LEVEL_C(value);
	}

}
