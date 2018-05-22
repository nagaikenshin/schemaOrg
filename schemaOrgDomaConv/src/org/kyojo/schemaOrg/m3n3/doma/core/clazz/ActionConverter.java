package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Action;

@ExternalDomain
public class ActionConverter implements DomainConverter<Action, String> {

	@Override
	public String fromDomainToValue(Action domain) {
		return domain.getNativeValue();
	}

	@Override
	public Action fromValueToDomain(String value) {
		return new ACTION(value);
	}

}
