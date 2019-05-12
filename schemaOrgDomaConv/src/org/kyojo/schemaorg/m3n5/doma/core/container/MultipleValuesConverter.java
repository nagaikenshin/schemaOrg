package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MULTIPLE_VALUES;
import org.kyojo.schemaorg.m3n5.core.Container.MultipleValues;

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
