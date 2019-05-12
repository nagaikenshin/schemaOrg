package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.REPEAT_FREQUENCY;
import org.kyojo.schemaorg.m3n5.pending.Container.RepeatFrequency;

@ExternalDomain
public class RepeatFrequencyConverter implements DomainConverter<RepeatFrequency, String> {

	@Override
	public String fromDomainToValue(RepeatFrequency domain) {
		return domain.getNativeValue();
	}

	@Override
	public RepeatFrequency fromValueToDomain(String value) {
		return new REPEAT_FREQUENCY(value);
	}

}