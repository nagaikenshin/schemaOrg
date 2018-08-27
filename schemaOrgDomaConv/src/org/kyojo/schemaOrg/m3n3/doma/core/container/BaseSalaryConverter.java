package org.kyojo.schemaorg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.core.impl.BASE_SALARY;
import org.kyojo.schemaorg.m3n3.core.Container.BaseSalary;

@ExternalDomain
public class BaseSalaryConverter implements DomainConverter<BaseSalary, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(BaseSalary domain) {
		return domain.getNativeValue();
	}

	@Override
	public BaseSalary fromValueToDomain(BigDecimal value) {
		return new BASE_SALARY(value);
	}

}
