package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COPYRIGHT_YEAR;
import org.kyojo.schemaorg.m3n4.core.Container.CopyrightYear;

@ExternalDomain
public class CopyrightYearConverter implements DomainConverter<CopyrightYear, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(CopyrightYear domain) {
		return domain.getNativeValue();
	}

	@Override
	public CopyrightYear fromValueToDomain(BigDecimal value) {
		return new COPYRIGHT_YEAR(value);
	}

}
