package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.KNOWS_ABOUT;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsAbout;

@ExternalDomain
public class KnowsAboutConverter implements DomainConverter<KnowsAbout, String> {

	@Override
	public String fromDomainToValue(KnowsAbout domain) {
		return domain.getNativeValue();
	}

	@Override
	public KnowsAbout fromValueToDomain(String value) {
		return new KNOWS_ABOUT(value);
	}

}
