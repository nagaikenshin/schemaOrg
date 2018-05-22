package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCREEN_COUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.ScreenCount;

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
