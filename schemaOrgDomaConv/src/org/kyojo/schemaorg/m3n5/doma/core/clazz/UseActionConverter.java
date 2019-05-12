package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.USE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.UseAction;

@ExternalDomain
public class UseActionConverter implements DomainConverter<UseAction, String> {

	@Override
	public String fromDomainToValue(UseAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public UseAction fromValueToDomain(String value) {
		return new USE_ACTION(value);
	}

}
