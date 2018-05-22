package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IGNORE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.IgnoreAction;

@ExternalDomain
public class IgnoreActionConverter implements DomainConverter<IgnoreAction, String> {

	@Override
	public String fromDomainToValue(IgnoreAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public IgnoreAction fromValueToDomain(String value) {
		return new IGNORE_ACTION(value);
	}

}
