package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.STEP;
import org.kyojo.schemaorg.m3n5.core.Container.Step;

@ExternalDomain
public class StepConverter implements DomainConverter<Step, String> {

	@Override
	public String fromDomainToValue(Step domain) {
		return domain.getNativeValue();
	}

	@Override
	public Step fromValueToDomain(String value) {
		return new STEP(value);
	}

}
