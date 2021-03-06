package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalStudyStatus.RESULTS_AVAILABLE;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalStudyStatus.ResultsAvailable;

@ExternalDomain
public class ResultsAvailableConverter implements DomainConverter<ResultsAvailable, String> {

	@Override
	public String fromDomainToValue(ResultsAvailable domain) {
		return domain.getNativeValue();
	}

	@Override
	public ResultsAvailable fromValueToDomain(String value) {
		return new RESULTS_AVAILABLE(value);
	}

}
