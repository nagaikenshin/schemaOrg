package org.kyojo.schemaorg.m3n4.doma.core.dataType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BOOLEAN;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;

@ExternalDomain
public class BooleanConverter implements DomainConverter<Boolean, java.lang.Boolean> {

	@Override
	public java.lang.Boolean fromDomainToValue(Boolean domain) {
		return domain.getNativeValue();
	}

	@Override
	public Boolean fromValueToDomain(java.lang.Boolean value) {
		return new BOOLEAN(value);
	}

}
