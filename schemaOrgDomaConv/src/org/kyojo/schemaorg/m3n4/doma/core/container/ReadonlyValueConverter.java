package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.READONLY_VALUE;
import org.kyojo.schemaorg.m3n4.core.Container.ReadonlyValue;

@ExternalDomain
public class ReadonlyValueConverter implements DomainConverter<ReadonlyValue, Boolean> {

	@Override
	public Boolean fromDomainToValue(ReadonlyValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReadonlyValue fromValueToDomain(Boolean value) {
		return new READONLY_VALUE(value);
	}

}
