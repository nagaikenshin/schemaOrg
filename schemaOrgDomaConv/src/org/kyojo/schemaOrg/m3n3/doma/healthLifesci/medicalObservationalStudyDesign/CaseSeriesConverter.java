package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalObservationalStudyDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalObservationalStudyDesign.CASE_SERIES;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalObservationalStudyDesign.CaseSeries;

@ExternalDomain
public class CaseSeriesConverter implements DomainConverter<CaseSeries, String> {

	@Override
	public String fromDomainToValue(CaseSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public CaseSeries fromValueToDomain(String value) {
		return new CASE_SERIES(value);
	}

}
