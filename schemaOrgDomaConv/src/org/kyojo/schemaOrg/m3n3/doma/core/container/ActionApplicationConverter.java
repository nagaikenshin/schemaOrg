package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACTION_APPLICATION;
import org.kyojo.schemaOrg.m3n3.core.Container.ActionApplication;

@ExternalDomain
public class ActionApplicationConverter implements DomainConverter<ActionApplication, String> {

	@Override
	public String fromDomainToValue(ActionApplication domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionApplication fromValueToDomain(String value) {
		return new ACTION_APPLICATION(value);
	}

}
