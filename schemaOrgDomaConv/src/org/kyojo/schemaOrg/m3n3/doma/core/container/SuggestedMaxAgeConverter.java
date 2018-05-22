package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUGGESTED_MAX_AGE;
import org.kyojo.schemaOrg.m3n3.core.Container.SuggestedMaxAge;

@ExternalDomain
public class SuggestedMaxAgeConverter implements DomainConverter<SuggestedMaxAge, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(SuggestedMaxAge domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuggestedMaxAge fromValueToDomain(BigDecimal value) {
		return new SUGGESTED_MAX_AGE(value);
	}

}
