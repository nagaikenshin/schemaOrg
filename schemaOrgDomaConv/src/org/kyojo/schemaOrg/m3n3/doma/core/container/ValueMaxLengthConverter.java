package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALUE_MAX_LENGTH;
import org.kyojo.schemaOrg.m3n3.core.Container.ValueMaxLength;

@ExternalDomain
public class ValueMaxLengthConverter implements DomainConverter<ValueMaxLength, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(ValueMaxLength domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValueMaxLength fromValueToDomain(BigDecimal value) {
		return new VALUE_MAX_LENGTH(value);
	}

}
