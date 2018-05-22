package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.REPETITIONS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Repetitions;

@ExternalDomain
public class RepetitionsConverter implements DomainConverter<Repetitions, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Repetitions domain) {
		return domain.getNativeValue();
	}

	@Override
	public Repetitions fromValueToDomain(BigDecimal value) {
		return new REPETITIONS(value);
	}

}
