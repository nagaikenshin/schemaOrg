package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalStudyStatus.RESULTS_NOT_AVAILABLE;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalStudyStatus.ResultsNotAvailable;

@ExternalDomain
public class ResultsNotAvailableConverter implements DomainConverter<ResultsNotAvailable, String> {

	@Override
	public String fromDomainToValue(ResultsNotAvailable domain) {
		return domain.getNativeValue();
	}

	@Override
	public ResultsNotAvailable fromValueToDomain(String value) {
		return new RESULTS_NOT_AVAILABLE(value);
	}

}
