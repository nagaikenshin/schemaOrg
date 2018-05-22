package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MULTIPLE_VALUES;
import org.kyojo.schemaOrg.m3n3.core.Container.MultipleValues;

@ExternalDomain
public class MultipleValuesConverter implements DomainConverter<MultipleValues, Boolean> {

	@Override
	public Boolean fromDomainToValue(MultipleValues domain) {
		return domain.getNativeValue();
	}

	@Override
	public MultipleValues fromValueToDomain(Boolean value) {
		return new MULTIPLE_VALUES(value);
	}

}
