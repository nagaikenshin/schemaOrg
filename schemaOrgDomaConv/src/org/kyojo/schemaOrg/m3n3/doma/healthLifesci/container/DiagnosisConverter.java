package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIAGNOSIS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diagnosis;

@ExternalDomain
public class DiagnosisConverter implements DomainConverter<Diagnosis, String> {

	@Override
	public String fromDomainToValue(Diagnosis domain) {
		return domain.getNativeValue();
	}

	@Override
	public Diagnosis fromValueToDomain(String value) {
		return new DIAGNOSIS(value);
	}

}
