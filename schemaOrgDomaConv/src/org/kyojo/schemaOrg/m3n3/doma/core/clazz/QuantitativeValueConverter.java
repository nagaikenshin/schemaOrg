package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.QUANTITATIVE_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue;

@ExternalDomain
public class QuantitativeValueConverter implements DomainConverter<QuantitativeValue, String> {

	@Override
	public String fromDomainToValue(QuantitativeValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public QuantitativeValue fromValueToDomain(String value) {
		return new QUANTITATIVE_VALUE(value);
	}

}
