package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.SPEECH_PATHOLOGY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.SpeechPathology;

@ExternalDomain
public class SpeechPathologyConverter implements DomainConverter<SpeechPathology, String> {

	@Override
	public String fromDomainToValue(SpeechPathology domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpeechPathology fromValueToDomain(String value) {
		return new SPEECH_PATHOLOGY(value);
	}

}
