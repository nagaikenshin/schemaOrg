package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalEvidenceLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalEvidenceLevel.EVIDENCE_LEVEL_A;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalEvidenceLevel.EvidenceLevelA;

@ExternalDomain
public class EvidenceLevelAConverter implements DomainConverter<EvidenceLevelA, String> {

	@Override
	public String fromDomainToValue(EvidenceLevelA domain) {
		return domain.getNativeValue();
	}

	@Override
	public EvidenceLevelA fromValueToDomain(String value) {
		return new EVIDENCE_LEVEL_A(value);
	}

}