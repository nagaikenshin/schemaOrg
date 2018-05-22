package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.STEPS;
import org.kyojo.schemaOrg.m3n3.core.Container.Steps;

@ExternalDomain
public class StepsConverter implements DomainConverter<Steps, String> {

	@Override
	public String fromDomainToValue(Steps domain) {
		return domain.getNativeValue();
	}

	@Override
	public Steps fromValueToDomain(String value) {
		return new STEPS(value);
	}

}
