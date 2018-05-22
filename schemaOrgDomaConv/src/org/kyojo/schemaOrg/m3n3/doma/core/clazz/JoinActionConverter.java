package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.JOIN_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.JoinAction;

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
