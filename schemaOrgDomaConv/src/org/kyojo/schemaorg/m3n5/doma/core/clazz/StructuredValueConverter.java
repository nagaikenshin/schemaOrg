package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.STRUCTURED_VALUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.StructuredValue;

@ExternalDomain
public class StructuredValueConverter implements DomainConverter<StructuredValue, String> {

	@Override
	public String fromDomainToValue(StructuredValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public StructuredValue fromValueToDomain(String value) {
		return new STRUCTURED_VALUE(value);
	}

}
