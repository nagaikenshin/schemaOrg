package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALUE_MIN_LENGTH;
import org.kyojo.schemaOrg.m3n3.core.Container.ValueMinLength;

@ExternalDomain
public class ValueMinLengthConverter implements DomainConverter<ValueMinLength, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(ValueMinLength domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValueMinLength fromValueToDomain(BigDecimal value) {
		return new VALUE_MIN_LENGTH(value);
	}

}
