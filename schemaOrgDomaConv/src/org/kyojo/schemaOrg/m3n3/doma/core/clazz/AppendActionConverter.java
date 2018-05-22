package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APPEND_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AppendAction;

@ExternalDomain
public class AppendActionConverter implements DomainConverter<AppendAction, String> {

	@Override
	public String fromDomainToValue(AppendAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AppendAction fromValueToDomain(String value) {
		return new APPEND_ACTION(value);
	}

}
