package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SCREEN_COUNT;
import org.kyojo.schemaorg.m3n4.core.Container.ScreenCount;

@ExternalDomain
public class ScreenCountConverter implements DomainConverter<ScreenCount, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(ScreenCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public ScreenCount fromValueToDomain(BigDecimal value) {
		return new SCREEN_COUNT(value);
	}

}
