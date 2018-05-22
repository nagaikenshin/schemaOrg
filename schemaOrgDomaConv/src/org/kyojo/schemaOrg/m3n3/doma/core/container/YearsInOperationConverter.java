package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.YEARS_IN_OPERATION;
import org.kyojo.schemaOrg.m3n3.core.Container.YearsInOperation;

@ExternalDomain
public class YearsInOperationConverter implements DomainConverter<YearsInOperation, String> {

	@Override
	public String fromDomainToValue(YearsInOperation domain) {
		return domain.getNativeValue();
	}

	@Override
	public YearsInOperation fromValueToDomain(String value) {
		return new YEARS_IN_OPERATION(value);
	}

}
