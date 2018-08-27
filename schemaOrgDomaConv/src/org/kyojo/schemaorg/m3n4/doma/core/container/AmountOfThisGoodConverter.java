package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AMOUNT_OF_THIS_GOOD;
import org.kyojo.schemaorg.m3n4.core.Container.AmountOfThisGood;

@ExternalDomain
public class AmountOfThisGoodConverter implements DomainConverter<AmountOfThisGood, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(AmountOfThisGood domain) {
		return domain.getNativeValue();
	}

	@Override
	public AmountOfThisGood fromValueToDomain(BigDecimal value) {
		return new AMOUNT_OF_THIS_GOOD(value);
	}

}
