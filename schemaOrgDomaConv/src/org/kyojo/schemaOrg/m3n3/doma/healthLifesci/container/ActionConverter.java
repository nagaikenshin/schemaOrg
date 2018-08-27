package org.kyojo.schemaorg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.healthLifesci.impl.ACTION;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.Action;

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
