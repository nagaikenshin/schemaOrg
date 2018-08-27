package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INTERACTION_COUNTER;
import org.kyojo.schemaorg.m3n4.core.Clazz.InteractionCounter;

@ExternalDomain
public class InteractionCounterConverter implements DomainConverter<InteractionCounter, String> {

	@Override
	public String fromDomainToValue(InteractionCounter domain) {
		return domain.getNativeValue();
	}

	@Override
	public InteractionCounter fromValueToDomain(String value) {
		return new INTERACTION_COUNTER(value);
	}

}
