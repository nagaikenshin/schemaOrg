package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalStudyStatus.ACTIVE_NOT_RECRUITING;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalStudyStatus.ActiveNotRecruiting;

@ExternalDomain
public class ActiveNotRecruitingConverter implements DomainConverter<ActiveNotRecruiting, String> {

	@Override
	public String fromDomainToValue(ActiveNotRecruiting domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActiveNotRecruiting fromValueToDomain(String value) {
		return new ACTIVE_NOT_RECRUITING(value);
	}

}
