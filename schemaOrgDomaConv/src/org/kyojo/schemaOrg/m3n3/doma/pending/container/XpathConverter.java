package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.XPATH;
import org.kyojo.schemaOrg.m3n3.pending.Container.Xpath;

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
