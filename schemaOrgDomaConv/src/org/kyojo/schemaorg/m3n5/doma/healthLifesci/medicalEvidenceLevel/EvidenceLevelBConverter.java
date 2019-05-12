package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalEvidenceLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalEvidenceLevel.EVIDENCE_LEVEL_B;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalEvidenceLevel.EvidenceLevelB;

@ExternalDomain
public class EvidenceLevelBConverter implements DomainConverter<EvidenceLevelB, String> {

	@Override
	public String fromDomainToValue(EvidenceLevelB domain) {
		return domain.getNativeValue();
	}

	@Override
	public EvidenceLevelB fromValueToDomain(String value) {
		return new EVIDENCE_LEVEL_B(value);
	}

}
