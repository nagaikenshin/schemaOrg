package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUSPEND_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SuspendAction;

@ExternalDomain
public class SuspendActionConverter implements DomainConverter<SuspendAction, String> {

	@Override
	public String fromDomainToValue(SuspendAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuspendAction fromValueToDomain(String value) {
		return new SUSPEND_ACTION(value);
	}

}
