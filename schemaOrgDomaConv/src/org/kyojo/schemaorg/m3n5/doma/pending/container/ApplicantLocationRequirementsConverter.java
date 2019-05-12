package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.APPLICANT_LOCATION_REQUIREMENTS;
import org.kyojo.schemaorg.m3n5.pending.Container.ApplicantLocationRequirements;

@ExternalDomain
public class ApplicantLocationRequirementsConverter implements DomainConverter<ApplicantLocationRequirements, String> {

	@Override
	public String fromDomainToValue(ApplicantLocationRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApplicantLocationRequirements fromValueToDomain(String value) {
		return new APPLICANT_LOCATION_REQUIREMENTS(value);
	}

}
