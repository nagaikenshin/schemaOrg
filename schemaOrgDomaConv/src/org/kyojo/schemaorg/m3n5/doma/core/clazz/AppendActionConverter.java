package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.APPEND_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.AppendAction;

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
