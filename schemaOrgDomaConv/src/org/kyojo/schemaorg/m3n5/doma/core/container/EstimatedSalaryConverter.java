package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ESTIMATED_SALARY;
import org.kyojo.schemaorg.m3n5.core.Container.EstimatedSalary;

@ExternalDomain
public class EstimatedSalaryConverter implements DomainConverter<EstimatedSalary, String> {

	@Override
	public String fromDomainToValue(EstimatedSalary domain) {
		return domain.getNativeValue();
	}

	@Override
	public EstimatedSalary fromValueToDomain(String value) {
		return new ESTIMATED_SALARY(value);
	}

}
