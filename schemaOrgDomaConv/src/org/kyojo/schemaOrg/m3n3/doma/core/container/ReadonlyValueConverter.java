package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.READONLY_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Container.ReadonlyValue;

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
