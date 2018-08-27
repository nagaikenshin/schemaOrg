package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STRENGTH_VALUE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StrengthValue;

@ExternalDomain
public class StrengthValueConverter implements DomainConverter<StrengthValue, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(StrengthValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public StrengthValue fromValueToDomain(BigDecimal value) {
		return new STRENGTH_VALUE(value);
	}

}
