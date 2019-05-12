package org.kyojo.schemaorg.m3n5.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.END_OFFSET;
import org.kyojo.schemaorg.m3n5.pending.Container.EndOffset;

@ExternalDomain
public class EndOffsetConverter implements DomainConverter<EndOffset, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(EndOffset domain) {
		return domain.getNativeValue();
	}

	@Override
	public EndOffset fromValueToDomain(BigDecimal value) {
		return new END_OFFSET(value);
	}

}
