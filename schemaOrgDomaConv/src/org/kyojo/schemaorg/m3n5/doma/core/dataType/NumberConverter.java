package org.kyojo.schemaorg.m3n5.doma.core.dataType;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUMBER;
import org.kyojo.schemaorg.m3n5.core.DataType.Number;

@ExternalDomain
public class NumberConverter implements DomainConverter<Number, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Number domain) {
		return domain.getNativeValue();
	}

	@Override
	public Number fromValueToDomain(BigDecimal value) {
		return new NUMBER(value);
	}

}
