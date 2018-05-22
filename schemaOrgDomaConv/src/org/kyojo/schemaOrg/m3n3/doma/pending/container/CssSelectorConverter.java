package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.CSS_SELECTOR;
import org.kyojo.schemaOrg.m3n3.pending.Container.CssSelector;

@ExternalDomain
public class CssSelectorConverter implements DomainConverter<CssSelector, String> {

	@Override
	public String fromDomainToValue(CssSelector domain) {
		return domain.getNativeValue();
	}

	@Override
	public CssSelector fromValueToDomain(String value) {
		return new CSS_SELECTOR(value);
	}

}
