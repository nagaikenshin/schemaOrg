package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DEFAULT_VALUE;
import org.kyojo.schemaorg.m3n4.core.Container.DefaultValue;

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
