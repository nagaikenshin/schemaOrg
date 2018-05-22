package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalStudyStatus.ENROLLING_BY_INVITATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalStudyStatus.EnrollingByInvitation;

@ExternalDomain
public class EnrollingByInvitationConverter implements DomainConverter<EnrollingByInvitation, String> {

	@Override
	public String fromDomainToValue(EnrollingByInvitation domain) {
		return domain.getNativeValue();
	}

	@Override
	public EnrollingByInvitation fromValueToDomain(String value) {
		return new ENROLLING_BY_INVITATION(value);
	}

}
