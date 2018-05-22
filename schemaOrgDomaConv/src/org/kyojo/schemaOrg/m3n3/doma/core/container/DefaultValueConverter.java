package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEFAULT_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Container.DefaultValue;

@ExternalDomain
public class DefaultValueConverter implements DomainConverter<DefaultValue, String> {

	@Override
	public String fromDomainToValue(DefaultValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public DefaultValue fromValueToDomain(String value) {
		return new DEFAULT_VALUE(value);
	}

}
