package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.RECRUITING;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.Recruiting;

@ExternalDomain
public class RecruitingConverter implements DomainConverter<Recruiting, String> {

	@Override
	public String fromDomainToValue(Recruiting domain) {
		return domain.getNativeValue();
	}

	@Override
	public Recruiting fromValueToDomain(String value) {
		return new RECRUITING(value);
	}

}
