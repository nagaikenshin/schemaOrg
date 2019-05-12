package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.FOLLOWUP;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Followup;

@ExternalDomain
public class FollowupConverter implements DomainConverter<Followup, String> {

	@Override
	public String fromDomainToValue(Followup domain) {
		return domain.getNativeValue();
	}

	@Override
	public Followup fromValueToDomain(String value) {
		return new FOLLOWUP(value);
	}

}
