package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SPONSOR;
import org.kyojo.schemaorg.m3n4.core.Container.Sponsor;

@ExternalDomain
public class SponsorConverter implements DomainConverter<Sponsor, String> {

	@Override
	public String fromDomainToValue(Sponsor domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sponsor fromValueToDomain(String value) {
		return new SPONSOR(value);
	}

}
