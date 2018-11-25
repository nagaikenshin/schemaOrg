package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.CSS_SELECTOR_TYPE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CssSelectorType;

@ExternalDomain
public class CssSelectorTypeConverter implements DomainConverter<CssSelectorType, String> {

	@Override
	public String fromDomainToValue(CssSelectorType domain) {
		return domain.getNativeValue();
	}

	@Override
	public CssSelectorType fromValueToDomain(String value) {
		return new CSS_SELECTOR_TYPE(value);
	}

}
