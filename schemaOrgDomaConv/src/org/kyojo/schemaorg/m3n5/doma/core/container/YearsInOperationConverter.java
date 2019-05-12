package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.YEARS_IN_OPERATION;
import org.kyojo.schemaorg.m3n5.core.Container.YearsInOperation;

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
