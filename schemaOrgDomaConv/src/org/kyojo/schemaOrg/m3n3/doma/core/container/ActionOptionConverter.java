package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACTION_OPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.ActionOption;

@ExternalDomain
public class ActionOptionConverter implements DomainConverter<ActionOption, String> {

	@Override
	public String fromDomainToValue(ActionOption domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionOption fromValueToDomain(String value) {
		return new ACTION_OPTION(value);
	}

}
