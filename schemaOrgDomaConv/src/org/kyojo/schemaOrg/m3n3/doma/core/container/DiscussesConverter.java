package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISCUSSES;
import org.kyojo.schemaOrg.m3n3.core.Container.Discusses;

@ExternalDomain
public class DiscussesConverter implements DomainConverter<Discusses, String> {

	@Override
	public String fromDomainToValue(Discusses domain) {
		return domain.getNativeValue();
	}

	@Override
	public Discusses fromValueToDomain(String value) {
		return new DISCUSSES(value);
	}

}
