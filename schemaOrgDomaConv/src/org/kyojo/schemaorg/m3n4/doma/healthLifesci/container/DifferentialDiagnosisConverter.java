package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DIFFERENTIAL_DIAGNOSIS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DifferentialDiagnosis;

@ExternalDomain
public class DifferentialDiagnosisConverter implements DomainConverter<DifferentialDiagnosis, String> {

	@Override
	public String fromDomainToValue(DifferentialDiagnosis domain) {
		return domain.getNativeValue();
	}

	@Override
	public DifferentialDiagnosis fromValueToDomain(String value) {
		return new DIFFERENTIAL_DIAGNOSIS(value);
	}

}
