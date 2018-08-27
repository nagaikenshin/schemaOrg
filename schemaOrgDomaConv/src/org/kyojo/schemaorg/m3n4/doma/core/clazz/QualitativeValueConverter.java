package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.QUALITATIVE_VALUE;
import org.kyojo.schemaorg.m3n4.core.Clazz.QualitativeValue;

@ExternalDomain
public class QualitativeValueConverter implements DomainConverter<QualitativeValue, String> {

	@Override
	public String fromDomainToValue(QualitativeValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public QualitativeValue fromValueToDomain(String value) {
		return new QUALITATIVE_VALUE(value);
	}

}
