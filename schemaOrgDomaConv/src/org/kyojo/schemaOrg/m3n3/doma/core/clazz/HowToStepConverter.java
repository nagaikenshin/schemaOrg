package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOW_TO_STEP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowToStep;

@ExternalDomain
public class HowToStepConverter implements DomainConverter<HowToStep, String> {

	@Override
	public String fromDomainToValue(HowToStep domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowToStep fromValueToDomain(String value) {
		return new HOW_TO_STEP(value);
	}

}
