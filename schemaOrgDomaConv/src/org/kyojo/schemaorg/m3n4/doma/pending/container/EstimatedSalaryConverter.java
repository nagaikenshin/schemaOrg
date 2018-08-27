package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ESTIMATED_SALARY;
import org.kyojo.schemaorg.m3n4.pending.Container.EstimatedSalary;

@ExternalDomain
public class EstimatedSalaryConverter implements DomainConverter<EstimatedSalary, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(EstimatedSalary domain) {
		return domain.getNativeValue();
	}

	@Override
	public EstimatedSalary fromValueToDomain(BigDecimal value) {
		return new ESTIMATED_SALARY(value);
	}

}
