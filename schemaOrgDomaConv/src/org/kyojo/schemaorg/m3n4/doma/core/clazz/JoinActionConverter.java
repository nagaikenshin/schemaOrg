package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.JOIN_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.JoinAction;

@ExternalDomain
public class JoinActionConverter implements DomainConverter<JoinAction, String> {

	@Override
	public String fromDomainToValue(JoinAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public JoinAction fromValueToDomain(String value) {
		return new JOIN_ACTION(value);
	}

}
