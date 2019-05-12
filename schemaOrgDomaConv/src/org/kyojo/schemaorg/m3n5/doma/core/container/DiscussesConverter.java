package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DISCUSSES;
import org.kyojo.schemaorg.m3n5.core.Container.Discusses;

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
