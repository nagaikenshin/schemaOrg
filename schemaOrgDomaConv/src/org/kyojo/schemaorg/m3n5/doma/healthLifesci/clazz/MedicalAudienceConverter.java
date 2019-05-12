package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_AUDIENCE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalAudience;

@ExternalDomain
public class MedicalAudienceConverter implements DomainConverter<MedicalAudience, String> {

	@Override
	public String fromDomainToValue(MedicalAudience domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalAudience fromValueToDomain(String value) {
		return new MEDICAL_AUDIENCE(value);
	}

}
