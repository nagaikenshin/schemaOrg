package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.COMMUNITY_HEALTH;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.CommunityHealth;

@ExternalDomain
public class CommunityHealthConverter implements DomainConverter<CommunityHealth, String> {

	@Override
	public String fromDomainToValue(CommunityHealth domain) {
		return domain.getNativeValue();
	}

	@Override
	public CommunityHealth fromValueToDomain(String value) {
		return new COMMUNITY_HEALTH(value);
	}

}
