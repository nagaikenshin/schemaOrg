package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.QUANTITY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Quantity;

@ExternalDomain
public class QuantityConverter implements DomainConverter<Quantity, String> {

	@Override
	public String fromDomainToValue(Quantity domain) {
		return domain.getNativeValue();
	}

	@Override
	public Quantity fromValueToDomain(String value) {
		return new QUANTITY(value);
	}

}
