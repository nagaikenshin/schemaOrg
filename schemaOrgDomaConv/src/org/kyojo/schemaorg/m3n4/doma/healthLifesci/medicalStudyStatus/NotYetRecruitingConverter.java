package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.NOT_YET_RECRUITING;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.NotYetRecruiting;

@ExternalDomain
public class NotYetRecruitingConverter implements DomainConverter<NotYetRecruiting, String> {

	@Override
	public String fromDomainToValue(NotYetRecruiting domain) {
		return domain.getNativeValue();
	}

	@Override
	public NotYetRecruiting fromValueToDomain(String value) {
		return new NOT_YET_RECRUITING(value);
	}

}
