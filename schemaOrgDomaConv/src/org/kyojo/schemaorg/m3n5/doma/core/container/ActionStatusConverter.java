package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACTION_STATUS;
import org.kyojo.schemaorg.m3n5.core.Container.ActionStatus;

@ExternalDomain
public class ActionStatusConverter implements DomainConverter<ActionStatus, String> {

	@Override
	public String fromDomainToValue(ActionStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionStatus fromValueToDomain(String value) {
		return new ACTION_STATUS(value);
	}

}
