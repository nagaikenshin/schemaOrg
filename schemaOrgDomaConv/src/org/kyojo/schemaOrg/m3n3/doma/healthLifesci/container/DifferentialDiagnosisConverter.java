package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIFFERENTIAL_DIAGNOSIS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DifferentialDiagnosis;

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
