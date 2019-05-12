package org.kyojo.schemaorg.m3n5.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.START_OFFSET;
import org.kyojo.schemaorg.m3n5.pending.Container.StartOffset;

@ExternalDomain
public class StartOffsetConverter implements DomainConverter<StartOffset, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(StartOffset domain) {
		return domain.getNativeValue();
	}

	@Override
	public StartOffset fromValueToDomain(BigDecimal value) {
		return new START_OFFSET(value);
	}

}
