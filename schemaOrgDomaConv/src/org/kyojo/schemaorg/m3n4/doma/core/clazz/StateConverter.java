package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.STATE;
import org.kyojo.schemaorg.m3n4.core.Clazz.State;

@ExternalDomain
public class StateConverter implements DomainConverter<State, String> {

	@Override
	public String fromDomainToValue(State domain) {
		return domain.getNativeValue();
	}

	@Override
	public State fromValueToDomain(String value) {
		return new STATE(value);
	}

}
