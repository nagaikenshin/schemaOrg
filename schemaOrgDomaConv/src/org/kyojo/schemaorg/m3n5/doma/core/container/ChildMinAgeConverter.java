package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHILD_MIN_AGE;
import org.kyojo.schemaorg.m3n5.core.Container.ChildMinAge;

@ExternalDomain
public class ChildMinAgeConverter implements DomainConverter<ChildMinAge, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(ChildMinAge domain) {
		return domain.getNativeValue();
	}

	@Override
	public ChildMinAge fromValueToDomain(BigDecimal value) {
		return new CHILD_MIN_AGE(value);
	}

}