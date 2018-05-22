package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.STAGE_AS_NUMBER;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StageAsNumber;

@ExternalDomain
public class StageAsNumberConverter implements DomainConverter<StageAsNumber, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(StageAsNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public StageAsNumber fromValueToDomain(BigDecimal value) {
		return new STAGE_AS_NUMBER(value);
	}

}
