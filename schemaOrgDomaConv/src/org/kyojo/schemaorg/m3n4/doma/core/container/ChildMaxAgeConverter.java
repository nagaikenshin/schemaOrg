package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CHILD_MAX_AGE;
import org.kyojo.schemaorg.m3n4.core.Container.ChildMaxAge;

@ExternalDomain
public class ChildMaxAgeConverter implements DomainConverter<ChildMaxAge, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(ChildMaxAge domain) {
		return domain.getNativeValue();
	}

	@Override
	public ChildMaxAge fromValueToDomain(BigDecimal value) {
		return new CHILD_MAX_AGE(value);
	}

}
