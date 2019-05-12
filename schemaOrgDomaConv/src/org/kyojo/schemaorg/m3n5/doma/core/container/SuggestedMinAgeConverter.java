package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUGGESTED_MIN_AGE;
import org.kyojo.schemaorg.m3n5.core.Container.SuggestedMinAge;

@ExternalDomain
public class SuggestedMinAgeConverter implements DomainConverter<SuggestedMinAge, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(SuggestedMinAge domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuggestedMinAge fromValueToDomain(BigDecimal value) {
		return new SUGGESTED_MIN_AGE(value);
	}

}
