package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACTION_STATUS_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ActionStatusType;

@ExternalDomain
public class ActionStatusTypeConverter implements DomainConverter<ActionStatusType, String> {

	@Override
	public String fromDomainToValue(ActionStatusType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionStatusType fromValueToDomain(String value) {
		return new ACTION_STATUS_TYPE(value);
	}

}
