package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.XPATH;
import org.kyojo.schemaorg.m3n4.pending.Container.Xpath;

@ExternalDomain
public class XpathConverter implements DomainConverter<Xpath, String> {

	@Override
	public String fromDomainToValue(Xpath domain) {
		return domain.getNativeValue();
	}

	@Override
	public Xpath fromValueToDomain(String value) {
		return new XPATH(value);
	}

}
