package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VALUE_MIN_LENGTH;
import org.kyojo.schemaorg.m3n4.core.Container.ValueMinLength;

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
