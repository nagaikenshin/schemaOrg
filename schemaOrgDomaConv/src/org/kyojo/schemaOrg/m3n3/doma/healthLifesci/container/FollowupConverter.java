package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.FOLLOWUP;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Followup;

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
